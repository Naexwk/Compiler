class var:
    id = ""
    vtype = ""
    alloc = 0

    def __init__(self, _id, _vtype, _alloc):
        self.id = _id
        self.vtype = _vtype
        self.alloc = _alloc

    def __repr__(self):
        return "var(" + self.id + "," + self.vtype + "," + str(self.alloc) + ")"

    def __str__(self):
        return "var(" + self.id + "," + self.vtype + "," + str(self.alloc) + ")"
    
    def __eq__(self, other):
        if isinstance(other, var):
            return self.id == other.id
        if isinstance(other, str):
            return self.id == other
        return NotImplemented

    def __ne__(self, other):
        x = self.__eq__(other)
        if x is NotImplemented:
            return NotImplemented
        return not x
    
class SemanticCube:
    matrix = {
        "+" : [
            ["int", "float", "string", "error"],
            ["float", "float", "string", "error"],
            ["string", "string", "string", "error"],
            ["error", "error", "error", "error"]
        ],
        "-" : [
            ["int", "float", "error", "error"],
            ["float", "float", "error", "error"],
            ["error", "error", "error", "error"],
            ["error", "error", "error", "error"]
        ],
        "*" : [
            ["int", "float", "error", "error"],
            ["float", "float", "error", "error"],
            ["error", "error", "error", "error"],
            ["error", "error", "error", "error"]
        ],
        "/" : [
            ["float", "float", "error", "error"],
            ["float", "float", "error", "error"],
            ["error", "error", "error", "error"],
            ["error", "error", "error", "error"]
        ],
        ">" : [
            ["bool", "bool", "error", "error"],
            ["bool", "bool", "error", "error"],
            ["error", "error", "error", "error"],
            ["error", "error", "error", "error"]
        ],
        "<" : [
            ["bool", "bool", "error", "error"],
            ["bool", "bool", "error", "error"],
            ["error", "error", "error", "error"],
            ["error", "error", "error", "error"]
        ],
        "!=" : [
            ["bool", "bool", "error", "error"],
            ["bool", "bool", "error", "error"],
            ["error", "error", "error", "error"],
            ["error", "error", "error", "error"]
        ],
        "=" : [
            ["int", "int", "error", "error"],
            ["error", "float", "error", "error"],
            ["error", "error", "string", "error"],
            ["error", "error", "error", "bool"]
        ]
    }

    def ConvertType(self, _type):
        if _type == "int":
            return 0
        if _type == "float":
            return 1
        if _type == "string":
            return 2
        if _type == "bool":
            return 3

    def Consult(self, oper, type1, type2):
        return self.matrix[oper][self.ConvertType(type1)][self.ConvertType(type2)]
    
        

class quad:
    operation = ""
    op1 = 0
    op2 = 0
    result = 0
    alloc = 0

    def __init__(self, _operation, _op1, _op2, _result, _alloc):
        self.operation = _operation
        self.op1 = _op1
        self.op2 = _op2
        self.result = _result
        self.alloc = _alloc
    
    def __repr__(self):
        return "(" + self.operation + "," + str(self.op1) + "," + str(self.op2) + "," + str(self.result)  + ")"

    def __str__(self):
        return "(" + self.operation + "," + str(self.op1) + "," + str(self.op2) + "," + str(self.result) + ")"
    
    def edit(self, paramIdx, value):
        if paramIdx == 0:
            self.operation = value
        if paramIdx == 1:
            self.op1 = value
        if paramIdx == 2:
            self.op2 = value
        if paramIdx == 3:
            self.alloc = value
        
        return self



class Middleman:
    cube = SemanticCube()
    variableTable = dict()
    functionTable = []
    quadruples = []
    
    tempVarDeclarations = []

    stack_operator = []
    stack_operands = []
    stack_jumps = []
    
    currentLevel = "global"
    currentType = "int"
    currentAlloc = 0
    currentTempId = 0

    variable = 0

    def __init__(self, ownerName):
        self.variableTable["owner"] = ownerName
        self.variableTable["global"] = []
        self.currentLevel = "global"

    def clearTempVarDeclaration(self):
        for element in self.tempVarDeclarations:
            variable = var(element, self.currentType, self.currentAlloc)
            self.currentAlloc = self.currentAlloc + 1
            self.variableTable[self.currentLevel].append(variable)
        self.tempVarDeclarations = []
    
    def variableExists(self, new):
        if new == self.variableTable["owner"]:
            return True
        if new in self.variableTable["global"]:
            return True
        if self.currentLevel != "global" and new in self.variableTable[self.currentLevel]:
            return True
        if new in self.tempVarDeclarations:
            return True
        
        return False
    
    def declareNewVariable(self, varName):
        if not self.variableExists(varName):
            self.tempVarDeclarations.append(varName)
        else:
            self.HandleError("Variable " + varName + " already declared") 
    
    def variableDeclared(self, varName):
        if not self.variableExists(varName):
            self.HandleError(varName + "does not exist in current context")
            return False
        
        return True
    
    def newFunction(self, new):
        if new not in self.functionTable:
            self.functionTable.append(new)
            self.currentLevel = new
            self.variableTable[self.currentLevel] = []
        else:
            self.HandleError("Function " + new + " already declared")
        
    def clearQuadrupleList(self, _op):
        query = self.getNextHierarchyOperator(_op)
        while len(self.stack_operator) > 0 and self.stack_operator[-1] not in query:
            op2 = self.stack_operands.pop()
            op1 = self.stack_operands.pop()
            oper = self.stack_operator.pop()
            type1 = type(op1).__name__
            type2 = type(op2).__name__
            if type1 == "str":
                type1 = self.getVariable(self.currentLevel, op1).vtype
            if type2 == "str":
                type2 = self.getVariable(self.currentLevel, op2).vtype
            result = self.newTempVar(oper, type1, type2)

            self.insertQuad(oper, op1, op2, result)

        if _op == ')' and len(self.stack_operator) > 0:
            self.stack_operator.pop()


    def getNextHierarchyOperator(self, _op):
        if _op in ['+', '-']:
            return ['<', '>', '!=', '(']
        
        if _op == ')':
            return ['(']
        
        if _op in ['<', '>', '!=', '(']:
            return ['eof', '(']
        
        if _op in ['*', '/']:
            return ['<', '>', '!=', '+', '-', '(']
        
        if _op == 'eoe':
            return ['$', '(']
        
    def checkBoolExpression(self):
        if type(self.stack_operands[-1]) is not str:
            self.HandleError("Type error")
            return False
        if self.getVariable(self.currentLevel, self.stack_operands[-1]).vtype != "bool":
            self.HandleError("Type error")
            return False
        
        return True
        
    def getVariable(self, scope, varId):
        for i in self.variableTable[scope]:
            if i.id == varId:
                return i
            
        if scope != "global":
            for i in self.variableTable["global"]:
                if i.id == varId:
                    return i
            
        return None

    def newTempVar(self, oper, type1, type2):
        self.currentTempId = self.currentTempId + 1
        name = "$t" +  str(self.currentTempId)
        vtype = self.cube.Consult(oper, type1, type2)
        if vtype != "error":
            temp = var(name, vtype, self.currentAlloc)
            self.currentAlloc = self.currentAlloc + 1
            if temp not in self.variableTable[self.currentLevel]:
                self.variableTable[self.currentLevel].append(temp)
            self.stack_operands.append(temp.id)
            return temp.id
        else: 
            self.HandleError("Operation not valid")
            return None
        
    def clearTempVars(self):
        self.currentTempId = 0

    def insertQuad(self, oper, op1, op2, res):
        self.quadruples.append(quad(oper, op1, op2, res, len(program.quadruples)))

    def assignInsertQuad(self, oper, op1, op2, res):
        type1 = type(op1).__name__
        type2 = type(res).__name__

        if type1 == "str":
            type1 = self.getVariable(self.currentLevel, op1).vtype
        if type2 == "str":
            type2 = self.getVariable(self.currentLevel, res).vtype

        vtype = self.cube.Consult(oper, type1, type2)
        if vtype == "error":
            self.HandleError("Type error")
            return
        self.quadruples.append(quad(oper, op1, op2, res, len(program.quadruples)))
        

    def editQuad(self, paramIdx, value, quadId):
        t = self.quadruples[quadId].edit(paramIdx, value)
        self.quadruples[quadId] = t
        
    def HandleError(self, message):

        raise Exception("Middleman: " + message)


program = Middleman("")
    
    

    


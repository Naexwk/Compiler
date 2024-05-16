class Middleman:
    variableTable = dict()
    functionTable = []
    currentLevel = "global"
    tempVarDeclarations = []

    def __init__(self, ownerName):
        self.variableTable["owner"] = ownerName
        self.variableTable["global"] = []
        self.currentLevel = "global"

    def clearTempVarDeclaration(self):
        for element in self.tempVarDeclarations:
            self.variableTable[self.currentLevel].append(element)
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
    
    def functionExists(self, new):
        if new in self.functionTable:
            return True
        else:
            return False

program = Middleman("")
    
    

    


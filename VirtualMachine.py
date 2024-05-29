def solve(quad):
    global memoria
    global end
    global pointer

    oper = quad.operation
    op1 = quad.op1
    op2 = quad.op2
    res = quad.result

    if oper == "+":
        memoria[res] = memoria[op1] + memoria[op2]

    if oper == "-":
        memoria[res] = memoria[op1] - memoria[op2]
    
    if oper == "*":
        memoria[res] = memoria[op1] * memoria[op2]
    
    if oper == "/":
        memoria[res] = memoria[op1] / memoria[op2]

    if oper == ">":
        memoria[res] = memoria[op1] > memoria[op2]

    if oper == "<":
        memoria[res] = memoria[op1] < memoria[op2]

    if oper == "!=":
        memoria[res] = memoria[op1] != memoria[op2]

    if oper == "=":
        memoria[res] = memoria[op1]

    if oper == "print":
        print(memoria[op1], end ="")

    if oper == "GOTO":
        pointer = op2
        return
    
    if oper == "GOTOF":
        if memoria[op1] == False:
            pointer = op2
            return
        
    if oper == "GOTOT":
        if memoria[op1] == True:
            pointer = memoria[op2]
            return

    if oper == "end":
        end = True
        return
    
    pointer += 1
    return

def run(memory, quadruples, pointerStart):
    global memoria
    global end
    global pointer
    memoria = memory
    end = False
    pointer = pointerStart
    while (not end):
        solve(quadruples[pointer])


        


        

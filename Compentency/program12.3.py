def Add(No1, No2):
    return No1 + No2

def Sub(No1, No2):
    return No1 - No2

def Mult(No1, No2):
    return No1 * No2

def Div(No1, No2):
    return No1 / No2

def main():
    Num1 = int(input("Enter first number: "))
    Num2 = int(input("Enter second number: "))

    Ret1 = Add(Num1 , Num2)
    print("Addition is :",Ret1)

    Ret2 = Sub(Num1 , Num2)
    print("Subtraction is :",Ret2)

    Ret3 = Mult(Num1 , Num2)
    print("Multiplication is :",Ret3)

    Ret4 = Div(Num1 , Num2)
    print("Division is :",Ret4)
    

if __name__ == "__main__":
    main()
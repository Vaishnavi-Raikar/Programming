def SumDigit(No):
    Sum = 0

    while(No > 0): 
        Digit = No % 10
        Sum = Sum + Digit
        No = No // 10

    return Sum

def main():
    Value = int(input("Enter the number : "))

    Ret = SumDigit(Value)

    print("The Sum of digit is : ",Ret)

if __name__ == "__main__":
    main()
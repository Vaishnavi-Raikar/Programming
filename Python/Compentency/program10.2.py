def SumOfNumbers(No):
    Sum = 0
    for i in range(No + 1):
        Sum = Sum + i

    return Sum

def main():
    Value = int(input("Enter the number : "))

    Ret = SumOfNumbers(Value)

    print("Addition is : ",Ret)

if __name__ == "__main__":
    main()
def CountDigit(No):
    Count = 0

    while(No > 1): 
        Count = Count + 1
        No = No / 10

    return Count

def main():
    Value = int(input("Enter the number : "))

    Ret = CountDigit(Value)

    print("The total number of digit is : ",Ret)

if __name__ == "__main__":
    main()
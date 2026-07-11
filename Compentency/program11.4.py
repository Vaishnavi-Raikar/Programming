def ReverseNo(No):
    Rev = 0

    while(No > 0): 
        Digit = No % 10
        Rev = (Rev * 10) + Digit
        No = No // 10

    return Rev

def main():
    Value = int(input("Enter the number : "))

    Ret = ReverseNo(Value)

    print("the reverse numebr is : ",Ret)

if __name__ == "__main__":
    main()
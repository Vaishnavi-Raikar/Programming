def CheckPalindrom(No):
    Rev = 0
    No1 = No 

    while(No >= 1): 
        Digit = No % 10
        Rev = (Rev * 10) + Digit
        No = No // 10

    if Rev == No1:
        return True
    else:
        return False


def main():
    Value = int(input("Enter the number : "))

    Ret = CheckPalindrom(Value)

    print("the Original number is : ", Value)

    if Ret == True:
        print("Its Palindrom..")
    else:
        print("Its not a Palindrom..")

if __name__ == "__main__":
    main()
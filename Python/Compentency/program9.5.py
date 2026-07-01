def CheckDivisible(No):
    if (No % 3 == 0 and No % 5 == 0):
        return True
    else:
        return False
    

def main():
    Value = int(input("Enter the number : "))

    Ret = CheckDivisible(Value)

    if Ret == True:
        print("Number is Divisible by 3 and 5")
    else:
        print("Number is not Divisible by 3 and 5")

if __name__ == "__main__":
    main()
        
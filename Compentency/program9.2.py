def CheckGreater(No1 , No2):
    if No1 > No2:
        print( "Maximum number is : ",No1)
    elif No2 > No1:
        print( "Maximum number is : ",No2)
    else:
        print("Both numbers are equal")

def main():
    Value1 = int(input("Enter 1st number : "))
    Value2 = int(input("Enter 2st number : "))

    CheckGreater(Value1, Value2)

if __name__ == "__main__":
    main()
        
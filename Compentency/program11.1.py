def CheckPrime(No):
    if No <= 1 :
        return False
    
    for i in range(2,No):
        if No % i == 0:
            return False

    return True


def main():
    Value = int(input("Enter the number : "))

    Ret = CheckPrime(Value)

    if Ret == True:
        print("Its prime..")
    else:
        print("Its not prime...")


if __name__ == "__main__":
    main()
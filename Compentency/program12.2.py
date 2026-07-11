def DisplayFactor(No):
    for i in range(1, No+1):
        if No % i == 0:
            print(i)
    print("\n")
   

def main():
    Value = int(input("Enter the Value : "))

    DisplayFactor(Value)

    

if __name__ == "__main__":
    main()
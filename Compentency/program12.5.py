def Number(Count):
    for i in range( Count, 0, -1):
        print(i)
    print("\n")

def main():
    Value = int(input("Enter the number : "))

    Number(Value)


if __name__ == "__main__":
    main()
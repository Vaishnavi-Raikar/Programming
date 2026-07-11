def ChkVowel(Char):
   if (Char == 'a' or Char == 'e' or Char == 'i' or Char == 'o' or Char == 'u' or Char == 'A' or Char == 'E' or Char == 'I' or Char == 'O' or Char == 'U'):
       return True
   else:
       return False


def main():
    Ch = input("Enter the Value : ")

    Ret = ChkVowel(Ch)

    if Ret == True:
        print("It is an Vowel")
    else:
        print("It is not an Vowel")
    

if __name__ == "__main__":
    main()
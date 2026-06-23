#include<stdio.h>

void Display(char ch)
{
    if (ch >= 'A' && ch <= 'Z')
    {
        printf("Outpur is : %c\n",ch + 32);
    }
    else if (ch >= 'a' && ch <= 'z')
    {
        printf("Outpur is : %c\n",ch - 32);
    }
    
}

int main()
{
    char cValue = '\0';

    printf("Enter the character: ");
    scanf("%c", &cValue);

    Display(cValue);

    return 0;

}
#include <stdio.h>

void Reverse(char *str) 
{
    char *start = str;
    char *end = str;
    char temp;
    
    if (str == NULL || *str == '\0') return;

    while (*end != '\0') 
    {
        end++;
    }
    end--; 

    while (start < end) 
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main() 
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^'\n']s", arr);

    Reverse(arr);
    printf("Reversed String: %s\n", arr);
    return 0;
}
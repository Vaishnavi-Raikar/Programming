#include <stdio.h>

int Difference(char *str)
{
    int iSmallCnt = 0;
    int iCapitalCnt = 0;
    if (str == NULL) return 0;

    while (*str != '\0') 
    {
        if (*str >= 'a' && *str <= 'z') 
        {
            iSmallCnt++;
        } 
        else if (*str >= 'A' && *str <= 'Z') 
        {
            iCapitalCnt++;
        }
        str++;
    }
    return iSmallCnt - iCapitalCnt;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^\n']s",arr);

    iRet = Difference(arr);

    printf("%d",iRet);

    return 0 ;

}
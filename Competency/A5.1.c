/*

Input :  5 
Output :  $  *  $  *  $  *  $  *  $  *

Input :  3 
Output :  $  *  $  *  $  *

Input :  -3 
Output :  $  *  $  *  $  *
*/
#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    // Handle negative values dynamically by converting to absolute value
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("$\n*\n");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter number: ");
    scanf("%d", &iValue);
    Pattern(iValue);
    return 0;
}
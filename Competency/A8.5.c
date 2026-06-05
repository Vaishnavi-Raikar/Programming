/*

Input :  5 
Output :  0.464515 

Input :  7 
Output :  0.650321  

*/

#include<stdio.h>

double SquareMeter(int iValue)
{
    double dConversionFactor = 0.0929;
    return iValue * dConversionFactor;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;
    printf("Enter area in square feet: ");
    scanf("%d", &iValue);
    dRet = SquareMeter(iValue);
    printf("Area in square meters is: %lf\n", dRet);
    return 0;
}
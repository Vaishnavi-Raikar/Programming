/*

Input :  10 
Output :  -12.2222 

Input :  34 
Output :  1.11111

*/

#include<stdio.h>

double FhtoCs(float fTemp)
{
    // Explicitly usage of 5.0/9.0 avoids standard integer truncation zero bugs
    return (fTemp - 32.0) * (5.0 / 9.0);
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fValue);
    dRet = FhtoCs(fValue);
    printf("Temperature in Celsius is: %lf\n", dRet);
    return 0;
}
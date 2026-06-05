/*

Input :  5.3  
Output :  88.2026
   
Input :  10.4  
Output :  339.6224 

*/

#include<stdio.h>

double CircleArea(float fRadius)
{
    float fPi = 3.14f;
    return fPi * fRadius * fRadius;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;
    printf("Enter radius: ");
    scanf("%f", &fValue);
    dRet = CircleArea(fValue);
    printf("Area of circle is: %lf\n", dRet);
    return 0;
}
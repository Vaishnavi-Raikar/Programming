#include <stdio.h>

int MultDigits(int iNo)
{
    int iProduct = 1;
    
    if (iNo == 0) {
        return 0;
    }
    
    if (iNo < 0) {
        iNo = -iNo;
    }

    while (iNo > 0) {
        iProduct *= (iNo % 10); 
        iNo /= 10;             
    }

    return iProduct;
}


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : ");
    scanf("%d", &iValue);

    iRet = MultDigits(iValue);
    
    printf("%d", iRet);

    return 0;
}
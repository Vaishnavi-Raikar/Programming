/*

Input :  12 
Output : -34  

Input :  (16 - 50)  10  
Output : -29 (8 - 37) 

*/

#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iSumFact = 0;
    int iSumNonFact = 0;

    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iSumFact = iSumFact + iCnt;
        }
        else
        {
            iSumNonFact = iSumNonFact + iCnt;
        }
    }
    return iSumFact - iSumNonFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number: ");
    scanf("%d", &iValue);
    iRet = FactDiff(iValue);
    printf("%d\n", iRet);
    return 0;
}
/*

Input :  12 
Output : 144  

Input :  13 
Output : 1  

Input :  10   
Output : 10

*/


#include<stdio.h>

int MultFact(int iNo)
{
    int iCnt = 0;
    int iMult = 1;
    int bHasFactors = 0;

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iMult = iMult * iCnt;
            bHasFactors = 1;
        }
    }
    
    if(bHasFactors == 0)
    {
        return 0; 
    }
    return iMult;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: ");
    scanf("%d", &iValue);
    
    iRet = MultFact(iValue);
    
    printf("%d\n", iRet);
    
    return 0;
}
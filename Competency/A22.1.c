#include<stdio.h>
void Pattern(int iNo)
{
    char ch = '\0';
    int i = 0;
    for(i = 0 , ch ='A'; i < iNo; i++)
    {
        printf("%c\t",ch);
        ch++;
    }
}

int main() 
{ 
    int iValue = 0; 
  
    printf("Enter number of elements"); 
    scanf("%d %d",&iValue); 
    
    Pattern(iValue); 
    
    return 0; 
} 
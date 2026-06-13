class Logic
{
    void printOddNumber(int n)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if (iCnt % 2 != 0) 
            {
                 System.out.println(iCnt);
            }
        }
        
    }
}
class A18C
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumber(20);
    }
}
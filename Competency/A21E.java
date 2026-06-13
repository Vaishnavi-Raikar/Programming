class Logic 
{
    void printDivisibleBy2and3(int n) 
    {
        System.out.print("Numbers divisible by both 2 and 3: ");
        
        for (int iCnt = 1; iCnt <= n; iCnt++) 
        {
            if ((iCnt % 2 == 0) && (iCnt % 3 == 0)) 
            {
                System.out.print(iCnt + " ");
            }
        }
        System.out.println();
    }
}

class A21E
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30); 
    }
}
class Logic 
{
    void countEvenOddRange(int n) 
    {
        int iEvenCount = 0;
        int iOddCount = 0;

        for (int iCnt = 1; iCnt <= n; iCnt++) 
        {
            if (iCnt % 2 == 0) 
            {
                iEvenCount++;
            } 
            else 
            {
                iOddCount++;
            }
        }

        System.out.println("Even numbers count: " + iEvenCount);
        System.out.println("Odd numbers count: " + iOddCount);
    }
}

class A21B
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50); 
    }
}
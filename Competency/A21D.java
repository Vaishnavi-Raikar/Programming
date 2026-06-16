class Logic 
{
    void countFactors(int num) 
    {
        if (num < 0) 
        {
            num = -num;
        }

        int iCount = 0;

        for (int iCnt = 1; iCnt <= num / 2; iCnt++) 
        {
            if (num % iCnt == 0) 
            {
                iCount++;
            }
        }

        if (num != 0) 
        {
            iCount++;
        }

        System.out.println("Total number of factors: " + iCount);
    }
}

class A21D
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countFactors(20); 
    }
}
class Logic
{
    void checkPrime (int num)
    {
        int iCount = 0;
        int iCnt = 1;

        while (iCnt <= num)
        {
            if (num % iCnt == 0)
            {
                iCount++; 
            }
            iCnt++; 
        }

        if (iCount == 2)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}

class A18A
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(12); 
    }
}
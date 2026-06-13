class Logic 
{
    void displayFactors(int num) 
    {
        if (num < 0) 
        {
            num = -num;
        }

        System.out.print("Factors of " + num + " are: ");

        for (int iCnt = 1; iCnt <= num / 2; iCnt++) 
        {
            if (num % iCnt == 0) 
            {
                System.out.print(iCnt + " ");
            }
        }
        
        if (num != 0) 
        {
            System.out.print(num);
        }
        System.out.println();
    }
}

class A21C
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.displayFactors(12); 
    }
}
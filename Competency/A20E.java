class Logic 
{
    void findSmallestDigit(int num) 
    {
        int iMin = 9; 
        int iNo = num;
        int iDigit = 0;
        
        while (num > 0) 
        {
            iDigit = num % 10;

            if (iDigit < iMin) 
            {
                iMin = iDigit; 
            }
            num /= 10;
        }
        
        System.out.println("The smallest digit in " + iNo + " is: " + iMin);
    }
}

class A20E
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872); 
    }
}
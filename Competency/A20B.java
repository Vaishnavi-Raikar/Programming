class Logic 
{
    void checkPalindrome(int num) 
    {
        int originalNum = num;
        int iRev = 0;
        
        while (num > 0) 
        {
            int digit = num % 10;
            iRev = (iRev * 10) + digit; 
            num = num / 10;
        }
        
        if (originalNum == iRev) 
        {
            System.out.println(originalNum + " is a palindrome number.");
        } else 
        {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}

class A20B
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121); 
    }
}
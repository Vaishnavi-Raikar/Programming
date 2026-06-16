class Logic
{
    void checkPalindrome(int num) 
    {
        int iNo = num;
        int ireverse = 0;
        int iDigit = 0;
        
        while (num > 0)
        {
            iDigit = num % 10;
            ireverse = (ireverse * 10) + iDigit;
            num = num / 10;
        }
        
        if (iNo == ireverse)
        {
            System.out.println(iNo + " is a palindrome number.");
        }
        else
        {
            System.out.println(iNo + " is NOT a palindrome number.");
        }
    }
}
class A17B
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic(); 
        obj.checkPalindrome(465); 
    }
}

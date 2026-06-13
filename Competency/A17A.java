class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        int iNo = num; 
        while (num > 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        
        System.out.println("Sum of digits of " + iNo + " is: " + sum);
    }
}

class A17A
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
    
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
        
        System.out.println("The sum of digits of " + iNo + " is: " + sum);
    }
}

class A20A
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234); 
    }
}
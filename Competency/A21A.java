class Logic
{
    void productOfDigits(int num)     
    {
        int iProduct = 1;
        int iNo = num;
        int iDigit = 0; 
        int iProduct = 0;
        
        if (num == 0)
        {
            iProduct = 0;
        }
        
        while (num > 0)
        {
            iDigit = num % 10;     
            iProduct = iProduct * iDigit; 
            num = num / 10;           
        }
        
        System.out.println("Product of digits of " + iNo + " is: " + iProduct);
    }
}

class A21A
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic(); 
        obj.productOfDigits(234); 
    }
}
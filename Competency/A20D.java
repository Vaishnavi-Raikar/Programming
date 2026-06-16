class Logic
{
    void findLargestDigit(int num) 
    {
        int iMax = 0, iDigit = 0; 
        int iNo = num; 
        
        while (num > 0)
        {
            iDigit = num % 10; 
            
            if (iDigit > iMax)      
            {
                iMax = iDigit;
            }
            
            num = num / 10;       
        }
        
        System.out.println("The largest digit in " + iNo + " is: " + iMax);
    }
}

class A20D
{
    public static void main(String args[])
    {
        Logic obj = new Logic();       
        obj.findLargestDigit(83429);  
    }
}
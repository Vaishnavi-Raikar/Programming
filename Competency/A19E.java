class Logic
{
    void calculatePower(int base, int exp) 
    {
        int iResult = 1;
        int iCnt = 0;
        
        for (iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult * base;
        }
        
        System.out.println(base + " raised to the power of " + exp + " is: " + iResult);
    }
}

class A19E
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic(); 
        obj.calculatePower(2, 5); 
    }
}

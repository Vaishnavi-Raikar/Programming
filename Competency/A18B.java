class Logic
{
    void printEvenNumber(int n)
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt <= n; iCnt++)
        if (iCnt%2==0) 
        {
            System.out.println(iCnt);
        }
    
    }
}
class A18B
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumber(20);
    }
}
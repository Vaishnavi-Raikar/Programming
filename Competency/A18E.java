class Logic
{
    void checkSign(int num)
    {
        if (num > 0)
        {
            System.out.println(num + " is a Positive number.");
        } 
        else if (num < 0) 
        {
            System.out.println(num + " is a Negative number.");
        } 
        else
        {
            System.out.println("The number is Zero.");
        }
    }
}
class A18E
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
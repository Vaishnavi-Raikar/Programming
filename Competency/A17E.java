class Logic
{
    void printTable(int num)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Table is:  "+ (num * i));
        }
    }
}
class A17E
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    } 
}
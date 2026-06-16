class Logic 
{
    void checkLeapYear(int year)
    {
        if (year % 4 == 0 ) 
        {
            System.out.println("It is a Leap year");
        }
        else
        {
            System.out.println("It is not a Leap year");
        }

    }
}

class A19A
{
    public static void main(String args[])
    {
        Logic obj =new Logic();
        obj.checkLeapYear(3000);
    }
}
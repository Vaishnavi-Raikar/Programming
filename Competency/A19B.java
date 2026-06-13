class Logic
{
    void displayGrade(int marks) 
    {
        if (marks >= 75 && marks <= 100)
        {
            System.out.println("First Class with Distinction");
        }
        else if (marks >= 60 && marks < 75)
        {
            System.out.println("First Class");
        }
        else if (marks >= 50 && marks < 60)
        {
            System.out.println("Second Class");
        }
        else if (marks >= 35 && marks < 50)
        {
            System.out.println("Pass Class");
        }
        else if (marks >= 0 && marks < 35)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Invalid Marks Entered!");
        }
    }
}

class A19B
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic(); 
        obj.displayGrade(82); 
    }
}
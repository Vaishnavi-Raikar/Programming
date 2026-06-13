class Logic
{
    void printDigits(int num) 
    {
        String strNum = Integer.toString(num);
        
        System.out.print("Digits of " + num + " separately: ");
        for (int i = 0; i < strNum.length(); i++)
        {
            System.out.print(strNum.charAt(i) + " ");
        }
        System.out.println();
    }
}

class A19D
{
    public static void main(String args[])
    {
        Logic obj = new Logic(); 
        obj.printDigits(9876); 
    }
}
class Logic {
    void sumEvenOddDigits(int num) {
        int evenSum = 0;
        int oddSum = 0;
        
        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) 
            {
                evenSum += digit;
            } 
            else 
            {
                oddSum += digit;
            }
            num /= 10;
        }
    
        System.out.println("Sum of Even digits = " + evenSum);
        System.out.println("Sum of Odd digits = " + oddSum);
    }
}

class A18D
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456); 
    }
}
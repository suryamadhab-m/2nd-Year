public class Q6 
{
    public static int divide(int dividend, int divisor) 
    {
        if (divisor == 0)
        {
        	throw new ArithmeticException("Divide by zero");
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int result = 0;

        for (int i = 31; i >= 0; i--) 
        {
            if ((a >>> i) >= b) 
            {
                a -= (b << i);
                result |= (1 << i);
            }
        }

        return negative ? ~result + 1 : result;
    }

    public static void main(String[] args)
    {
        System.out.println("Result: " + divide(20, -4));
    }
}

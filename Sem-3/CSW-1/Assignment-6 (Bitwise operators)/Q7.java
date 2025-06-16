public class Q7 
{
    public static int power(int x, int y) 
    {
        int result = 1;
        while (y > 0) 
        {
            if ((y & 1) == 1) 
            {
                result = multiply(result, x);
            }
            x = multiply(x, x);
            y >>>= 1;
        }
        return result;
    }

    public static int multiply(int a, int b)
    {
        int result = 0;
        while (b != 0) 
        {
            if ((b & 1) == 1) 
            {
                result = add(result, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return result;
    }

    public static int add(int a, int b) 
    {
        while (b != 0) 
        {
            int carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println("2^5 = " + power(2, 5));
    }
}

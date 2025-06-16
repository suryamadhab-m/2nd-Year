public class Q8 
{
    public static int reverse(int num)
    {
        boolean negative = num < 0;
        num = Math.abs(num);
        int reversed = 0;

        while (num != 0) 
        {
            int digit = num & 0xF; // extract last 4 bits for the digit
            reversed = (reversed << 3) + (reversed << 1) + digit; // reversed * 10 + digit
            num /= 10;
        }

        return negative ? ~reversed + 1 : reversed;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse(123));   // 321
        System.out.println(reverse(-245));  // -542
    }
}

public class Q11
{
    public static int countEvenDigits(int num)
    {
        int count = 0;
        num = num < 0 ? ~num + 1 : num; // Make it positive using bitwise

        while (num != 0)
        {
            int digit = num % 10;
            if ((digit & 1) == 0) count++; // Even if LSB is 0
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Even digits: " + countEvenDigits(482913));
    }
}

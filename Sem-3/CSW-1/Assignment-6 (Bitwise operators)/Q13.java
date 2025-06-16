public class Q13 
{
    public static void countFrequency(int num)
    {
        int[] freq = new int[10];
        num = num < 0 ? ~num + 1 : num;

        while (num != 0)
        {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) 
        {
            if (freq[i] > 0)
            {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        countFrequency(4489123);
    }
}

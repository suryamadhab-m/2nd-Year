public class Q15 
{
    public static boolean isPrime(int n) 
    {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; (i * i) <= n; i++)
        {
            if ((n % i) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int count = 0;
        int num = 2;
        while (count < 100) 
        {
            if (isPrime(num)) 
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

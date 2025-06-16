public class Q16 
{
    // Check if number is prime using basic trial division
    public static boolean isPrime(int n) 
    {
        if ((n | 1) == 1) 
        	return false; // 0 or 1 are not prime

        // Use bitwise-based multiplication check (i * i <= n)
        for (int i = 2; (i * i) <= n; i++)
        {
            if ((n % i) == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int start = 10;
        int end = 50;

        for (int i = start; i <= end; i++) 
        {
            // Bitwise trick: skip even numbers except 2
            if (i == 2 || ((i & 1) == 1 && isPrime(i))) {
                System.out.print(i + " ");
            }
        }
    }
}

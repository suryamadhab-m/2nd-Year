public class Q4 
{
    public static long reverseBits(long n) 
    {
        long result = 0;
        for (int i = 0; i < 64; i++) 
        {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        long input = 0xAAAAAAAAAAAAAAAAL;
        System.out.println("Reversed: " + Long.toBinaryString(reverseBits(input)));
    }
}

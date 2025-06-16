public class Q2
{
    public static int computeParity(int n) 
    {
        int parity = 0;
        while (n != 0)
        {
            parity ^= (n & 1);
            n >>>= 1;
        }
        return parity;
    }

    public static void main(String[] args)
    {
        int number = 29;
        System.out.println("Parity: " + computeParity(number));
    }
}

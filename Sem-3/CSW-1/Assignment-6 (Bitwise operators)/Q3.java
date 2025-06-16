public class Q3 
{
    public static int swapBits(int n, int i, int j) 
    {
        int bit1 = (n >> i) & 1;
        int bit2 = (n >> j) & 1;

        if (bit1 != bit2) 
        {
            n ^= (1 << i) | (1 << j);
        }

        return n;
    }

    public static void main(String[] args)
    {
        int number = 29;
        int i = 0, j = 3;
        System.out.println("After swapping: " + swapBits(number, i, j));
    }
}

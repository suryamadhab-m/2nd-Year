public class Q1 
{
    public static int countBits(int n)
    {
        int count = 0;
        while (n != 0)
        {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int number = 29;
        System.out.println("Set bits: " + countBits(number));
    }
}

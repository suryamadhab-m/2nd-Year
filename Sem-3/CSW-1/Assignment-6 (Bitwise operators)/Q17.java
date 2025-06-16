public class Q17 
{
    public static boolean isEven(int n) 
    {
        return ((n & 1) ^ 1) == 1;
    }

    public static void main(String[] args)
    {
        int number = 42;
        System.out.println(number + " is even? " + isEven(number));
    }
}

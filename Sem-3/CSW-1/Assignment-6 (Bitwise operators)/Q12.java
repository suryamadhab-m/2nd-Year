public class Q12 
{
    public static int mergeDigits(int a, int b) 
    {
        int firstTwo = getFirstTwoDigits(a);
        int lastTwo = b % 100;
        return (firstTwo * 100) + lastTwo;
    }

    public static int getFirstTwoDigits(int num)
    {
        while (num >= 100) num /= 10;
        return num;
    }

    public static void main(String[] args)
    {
        System.out.println("Merged number: " + mergeDigits(45678, 312)); // 4512
    }
}

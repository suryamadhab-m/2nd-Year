public class Q9 
{
    public static boolean isPalindrome(int num) 
    {
        if (num < 0) return false;
        return num == reverse(num);
    }

    public static int reverse(int num)
    {
        int reversed = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            reversed = (reversed << 3) + (reversed << 1) + digit; // reversed * 10 + digit
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args)
    {
        System.out.println("121 is palindrome: " + isPalindrome(121));
        System.out.println("123 is palindrome: " + isPalindrome(123));
    }
}

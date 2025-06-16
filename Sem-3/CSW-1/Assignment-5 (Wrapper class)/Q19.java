public class Q19 
{
    public static void main(String[] args)
    {
        int[] a = {3, 6, 1, 8, 2};
        int n = a.length;

        for (int i = 0; i < n / 2; i++)
        {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        System.out.print("Reversed array: ");
        for (int i=0; i<n; i++)
        {
        	System.out.print(a[i]+" ");
        }
    }
}

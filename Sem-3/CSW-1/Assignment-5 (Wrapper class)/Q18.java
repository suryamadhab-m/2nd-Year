import java.util.Arrays;

public class Q18 
{
    public static void main(String[] args) 
    {
        int[] arr = {4, 7, 2, 9, 1, 5};
        int k = 2; // change as needed

        // Bubble sort
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(k + "th smallest = " + arr[k-1]);
        System.out.println(k + "th largest = " + arr[arr.length - k]);
    }
}

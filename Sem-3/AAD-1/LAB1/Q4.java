import java.util.*;
public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no. of term.");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		int max=a[0];
		int min=a[0];
		for (int i=0; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximun element is "+max);
		System.out.println("Minimum element is "+min);
	}

}

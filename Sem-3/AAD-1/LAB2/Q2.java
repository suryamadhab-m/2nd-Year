import java.util.*;
public class Q2 
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
		int sm=rmin(a,n-1);
		System.out.println(sm);
	}
	public static int min(int a, int b)
	{
		if (a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int rmin(int a[], int n)
	{
		if (n<=1)
		{
			return a[0];
		}
		
		else
		{
			return(min(rmin(a,n-1),a[n]));
		}
	}

}

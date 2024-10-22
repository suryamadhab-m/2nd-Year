import java.util.*;
public class Q5 
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
		System.out.println("Enter element to be searched:");
		int ele=sc.nextInt();
		int x=rsrch(a,n-1,ele);
		if (x>=0)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not found");
		}

	}
	public static int rsrch(int a[], int n, int ele)
	{
		if (n==0)
		{
			return(-1);
		}
		else
		{
			if (a[n]==ele)
			{
				return(n);
			}
			else
			{
				return(rsrch(a,n-1,ele));
			}
		}
	}

}

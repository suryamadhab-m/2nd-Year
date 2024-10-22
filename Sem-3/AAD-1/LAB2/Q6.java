import java.util.*;
public class Q6 
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
		System.out.print("Enter no. to search:");
		int ele=sc.nextInt();
		int start=0;
		int end=n-1;
		int res=rbsrch(a,start,end,ele);
		if (res>=0)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not found");
		}
	}
	public static int rbsrch(int a[], int s, int e, int ele)
	{
		int mid=(s+e)/2;
		if (a[mid]==ele)
		{
			return mid;
		}
		else if(ele<a[mid])
		{
			return rbsrch(a, s,(mid-1),ele);
		}
		else
		{
			return rbsrch(a, (mid+1), e, ele);
		}
	}

}

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
		System.out.print("Enter the no. to be searched:");
		int x=sc.nextInt();
		int count=0;
		int start=0;
		int end=n-1;
		while (start<=end)
		{
			int mid=(start+end)/2;
			if (x==a[mid])
			{
				System.out.println("Element found!");
				count+=1;
				break;
			}
			else if (x<a[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
	
		}
		if (count==0)
		{
			System.out.println("Not found");
		}
	}

}

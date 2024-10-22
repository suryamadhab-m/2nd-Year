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
		System.out.print("Enter the element to be searched:");
		int ele=sc.nextInt();
		int count=0;
		for (int i=0; i<a.length; i++)
		{
			if (ele==a[i])
			{
				System.out.println("FOUND!!");
				count+=1;
			}
		}
		if (count==0)
		{
			System.out.println("Not found");
		}
		sc.close();
	}
		

}

import java.util.*;
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			int min=a[i];
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) 
		{
			System.out.println(a[i] + " ");
		}	

	}

}

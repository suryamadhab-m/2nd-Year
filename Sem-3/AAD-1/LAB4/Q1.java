import java.util.*;
public class Q1 
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
		
		for(int i=0; i<n-1; i++)
		{
			b[i]=a[i];
			for(int j=0; j<n-i-1; j++)
			{
				
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;                                                                      
				}
				
				
			}
		}
		for(int i=0; i<n; i++) 
		{
			System.out.println(a[i] + " ");
		}	

	}

}

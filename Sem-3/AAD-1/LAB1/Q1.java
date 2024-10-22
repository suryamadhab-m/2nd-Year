import java.util.*;
public class Q1 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter no. of terms to be input: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		for (int i=1; i<=n; i++)
		{
			System.out.print("Enter no:");
			int x=sc.nextInt();
			sum+=x;
			
		}
		System.out.println("Sum is: "+sum);

	}

}

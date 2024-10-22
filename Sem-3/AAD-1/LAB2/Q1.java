import java.util.*;
public class Q1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int sum=rsum(n);
		System.out.println("Sum is "+sum);
		

	}
	public static int rsum(int n)
	{
		if (n==0)
		{
			return(0);
		}
		else if (n==1)
		{
			Scanner sc=new Scanner(System.in);
			int y=sc.nextInt();
			return(y);
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			int y=sc.nextInt();
			return(rsum(n-1)+y);
		}
		
	}

}

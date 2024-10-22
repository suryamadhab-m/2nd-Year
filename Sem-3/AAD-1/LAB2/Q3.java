import java.util.*;
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int f=fact(n);
		System.out.println("Factorial of "+n+" is "+f);

	}
	public static int fact(int n)
	{
		if (n==0 || n==1)
		{
			return(1);
		}
		else
		{
			return(fact(n-1)*n);
		}
	}

}

import java.util.*;
public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the term position to display.:");
		int n=sc.nextInt();
		int res=fbn(n);
		System.out.println("Fibonacci series:"+res);

	}
	public static int fbn(int n)
	{
		if (n==1)
		{
			return (0);
		}
		else if (n==2)
		{
			return(1);
		}
		else
		{
			return (fbn(n-1)+fbn(n-2));
		}
	}

}

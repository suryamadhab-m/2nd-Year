import java.util.*;
public class Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int sum=0;
		int res=digitsum(n,sum);
		System.out.println("Sum of the digit is "+res);
	}
	public static int digitsum(int n, int sum)
	{
		if (n==0)
		{
			return sum;
		}
		else
		{
			sum=sum+n%10;
			return(digitsum((n/10),sum));
		}
	}

}

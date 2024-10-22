import java.util.*;
public class Q5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the term position to display.:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		int pos=3;
		System.out.println("Fibonacci series:");
		if (n==1)
		{
			System.out.println(a);
		}
		else if (n==2)
		{
			System.out.println(b);
		}
		else
		{
			while(pos<=n)
			{
				c=a+b;
				a=b;
				b=c;
				pos++;
			}
		}
		System.out.println(n+"th Fibonacci no. is "+b);
	}

}

import java.util.*;
public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter base:");
		int x=sc.nextInt();
		System.out.print("Enter power:");
		int n=sc.nextInt();
		int res=pow(x,n);
		System.out.println(x+" to the power "+n+" is "+res);
		

	}
	public static int pow(int b, int p)
	{
		if (p==0)
		{
			return 1;
		}
		else
		{
			return(b*pow(b,p-1));
		}
	}
}

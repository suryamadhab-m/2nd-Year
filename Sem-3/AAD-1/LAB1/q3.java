import java.util.*;
public class q3 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a no.:");
		int n=sc.nextInt();
		int count=1;
		int fact=1;
		while(count<=n)
		{
			fact*=count;
			count+=1;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		sc.close();
	}

}

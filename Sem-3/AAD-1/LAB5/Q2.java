import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		for(int i=0;i<n;i++)
		{
			a[i]=a[i]-min;
		}
		for(int i1=0;i1<n;i1++)
		{
			System.out.print(a[i1]+" ");
		}
		for(int i=n-1;i>0;i--)
		{
			if(a[i]==0)
			{
				del(a,i);
			}
		}
		
		for(int i1=0;i1<n;i1++)
		{
			System.out.print(a[i1]+" ");
		}
	}
	public static void del(int a[],int p)
	{
		for(int i=0;i<a.length;i++)
		{
			if((i+1)>=p) 
			{
				if((i+1)==a.length)
					a[i]=0;
				else
				a[i]=a[i+1];
			}	
		}

		
	
}

}

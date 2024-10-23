import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array a:");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter size of array b:");
		int y=sc.nextInt();
		int b[]=new int[y];
		int c[]=new int[x+y];
		System.out.println("Enter array elements for array a in sorted order:");
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter array elements for array b in sorted order:");
		for(int i=0;i<y;i++)
		{
			b[i]=sc.nextInt();
		}
		int i=0,j=0,h1=x-1,h2=y-1;
		int k=0;
		while(i<=h1&&j<=h2)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		System.out.println(k);
		System.out.println(i);
		System.out.println(j);
		if(i>=h1&&j<=h2)
		{
			while(j<=h2)
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		if(i<=h1&&j>=h2)
		{
			while(i<=h1)
			{
				c[k]=a[i];
				i++;
				k++;
			}
		}
		for(int l=0;l<c.length;l++)
		{
			System.out.print(c[l]+" ");
		}
	}

}

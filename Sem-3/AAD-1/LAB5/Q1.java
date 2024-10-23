import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements 0s and 1s:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int p=0;
		int q=n-1;
		while(p<q)
		{int t=5;
			if(a[p]!=0&&a[q]==0)
			{
				t=a[p];
				a[p]=a[q];
				a[q]=t;
				q--;
			}
			p++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}

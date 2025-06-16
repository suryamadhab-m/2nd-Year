import java.util.*;
public class linkedList 
{

	public static void main(String[] args) 
	{
		
LinkedList<Integer> l=new LinkedList<Integer>();
		
		//insertion at beginning
		l.addFirst(5);
		l.addFirst(10);
		l.addFirst(15);
		System.out.println(l);
		
		//insertion at end
		l.addLast(3);
		l.addLast(4);
		System.out.println(l);
		
		//insertion at any position
		l.add(2,15);
		System.out.println(l);
		
		//delete at beginning
		l.removeFirst();
		System.out.println(l);
		
		//delete at end
		l.removeLast();
		System.out.println(l);
		
		//delete at any position
		l.remove(1);
		System.out.println(l);
		
		//check if LL is empty
		boolean ans=l.isEmpty();
		System.out.println(ans);
		
		//count no. of nodes
		int count=l.size();
		System.out.println(count);
		
		//sort LinkedList
		l.sort(null);
		System.out.println(l);
	
		
		//merging two sorted linked list
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(6);
		System.out.println(l1);
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(5);
		System.out.println(l2);
		
		LinkedList<Integer> lmerge=new LinkedList<Integer>();
		
		for(int i=0; i<l1.size(); i++)
		{
			lmerge.addLast(l1.get(i));
		}
		
		for(int i=0; i<l2.size(); i++)
		{
			lmerge.addLast(l2.get(i));
		}
		for(int i=0; i<l1.size(); i++)
		{
			int min=l1.get(i);
			for(int j=0; j<l2.size(); j++)
			{
				if(l2.get(j)<min)
				{
					min=l2.get(j);
				}
			}
			lmerge.add(i,min);
		}
		
		System.out.println("Sorted array is:");
		System.out.println(lmerge);
		
		
		
		
	}

}

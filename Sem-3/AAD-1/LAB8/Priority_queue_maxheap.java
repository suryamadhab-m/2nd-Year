import java.util.*;

public class Priority_queue_maxheap {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		int a[]= {1,2,10,8,7,3,4,6,5,9};
		
		for(int i=0; i<a.length; i++)
		{
			pq.add(i);
		}
		System.out.println("Printing priority queue heap "+pq);
		System.out.println("Remove elements of Priority queue");
		while(pq.isEmpty()==false)
		{
			System.out.print(pq.remove()+" ");
		}

	}

}

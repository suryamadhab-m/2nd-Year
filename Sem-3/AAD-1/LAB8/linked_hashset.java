import java.util.*;
public class linked_hashset 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer>hs=new LinkedHashSet<Integer>();
		
		
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(100);
		
		//display hashset
		System.out.println(hs);
		
		//traversing hashset
		for(Integer i: hs)
		{
			System.out.println(i);
		}
		
		//size of hashset
		System.out.println("size is "+hs.size());
		
		//removing element
		hs.remove(300);
		System.out.println("NEW hashset is "+hs);

	}

}

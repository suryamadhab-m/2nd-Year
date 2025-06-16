import java.util.*;
public class hash_set 
{

	public static void main(String[] args) 
	{
		HashSet<String>hs=new HashSet<String>();
		
		
		hs.add("x");
		hs.add("y");
		hs.add("z");
		hs.add("x");
		hs.add("p");
		hs.add("x");
		
		//display hashset
		System.out.println(hs);
		
		//traversing hashset
		for(String i: hs)
		{
			System.out.println(i);
		}
		
		//size of hashset
		System.out.println("size is "+hs.size());
		
		//removing element
		hs.remove("x");
		System.out.println("NEW hashset is "+hs);

	}

}

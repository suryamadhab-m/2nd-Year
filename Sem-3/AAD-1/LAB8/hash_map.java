import java.util.*;
public class hash_map 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		
		hm.put("a",10);
		hm.put("b",20);
		hm.put("c",30);
		
		System.out.println(hm);
		
		for(Map.Entry<String, Integer> entry:hm.entrySet())
		{
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
				
		
	}

}

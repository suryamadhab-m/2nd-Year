import java.util.*;
public class tree_map 
{

	public static void main(String[] args) 
	{
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		
		tm.put("a", 10);
		tm.put("b", 20);
		tm.put("c", 30);
		
		Set<Map.Entry<String, Integer>> st=tm.entrySet();
		for(Map.Entry<String, Integer> me:st)
		{
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
 
import java.util.*;
public class arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		//addition element in array;
		a.add(2);
		a.add(4);
		a.add(6);
		
		//size of array
		int length=a.size();
		
		//removing element from array
		a.remove(1);
		
		//inserting element at particular position
		a.add(3,10);
		
		//displaying array
		System.out.println(a);
		
		//removing all elements to an array;
		a.removeAll(a);
		
		//to check if array is empty
		boolean ans=a.isEmpty();
		
		
		

		
		
		
	}

}

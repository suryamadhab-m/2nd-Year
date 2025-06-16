import java.util.*;
public class stack 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		 
		//push
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		
		//pop
		s.pop();
		System.out.println(s);
		System.out.println(s.pop());
		
		//isEmpty??
		System.out.println(s.isEmpty());
		
		//display top element
		System.out.println(s.peek());
		
		//search an element
		System.out.println(s.search(4));
		
	}

}

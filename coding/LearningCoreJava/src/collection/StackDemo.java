package collection;

import java.util.Stack;

public class StackDemo {

	
	public static void main(String[] args) {
		
		
		Stack<Integer> s= new Stack<>();
		s.add(10);
		s.add(40);
		s.add(80);
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.pop());
		
	}
}

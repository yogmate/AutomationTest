package collection;

import java.util.Iterator;
import java.util.Vector;

public class Stack {
	
	public static void main(String[] args) {
		
		Stack ll= new Stack();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		//ll.addFirst(100);
		//ll.addLast(200);
		ll.clear();
		ll.set(2, 400);
		System.out.println(ll);
		
		for(int i=0; i>ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		for(Integer i:ll)
		{
			System.out.println(i);
		}
		
		//Iterator
	Iterator<Integer> itr= ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
		
	}

	private void set(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void clear() {
		// TODO Auto-generated method stub
		
	}

	private void add(int i) {
		// TODO Auto-generated method stub
		
	}

}
package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
	
	public static void main(String[] args) {
		
		Vector<Integer> ll= new Vector<Integer>();
		
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

}
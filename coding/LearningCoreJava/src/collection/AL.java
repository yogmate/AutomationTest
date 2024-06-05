package collection;

import java.util.ArrayList;
import java.util.List;

import javasession.WhileLoop;

public class AL {
	
	public static void main(String[] args) {
		
		//List<E> list= new ArrayList<E>();
		ArrayList<Integer> al= new ArrayList<>();
		System.out.println(al);
		al.add(10);
		al.add(20);
		System.out.println(al);
		System.out.println(al.contains(10));
		
		
   //get element	
		al.get(0);
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i)+ " ");
		}
		
		
		
	}

}

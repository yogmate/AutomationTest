package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TEst {
	
	public static void main(String[] args) {
		
	ArrayList<Double> studentmarkspercentage= new ArrayList<Double>();
	studentmarkspercentage.add(98.99);
	studentmarkspercentage.add(98.09);
	studentmarkspercentage.add(90.99);
	studentmarkspercentage.add(97.99);
	studentmarkspercentage.add(96.99);
		
	//using iterator
	Iterator<Double> itr = studentmarkspercentage.iterator();
	while(itr.hasNext())
	{
	
		double marks= itr.next();
		if(marks==98.99)
		{
			System.out.println("I a second topper");
			
		}
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1000);
		al.add(2000);
		
		al.addAll(al);
		
		System.out.println("=======al list updated");
		System.out.println(al);
		
		al.clear();
	    System.out.println(al);
	    System.out.println(al.isEmpty());
		
		
	}
	
	
	}

}

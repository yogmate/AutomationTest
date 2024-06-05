package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	
	private static final List<Integer> a1 = null;

	public static void main(String[] args) {
		
		//int [] arr= {10,20,30,3344};
		
		//int [] arr1= new int [19]; 
		
		List<Integer> a1= new ArrayList<Integer>();
		List<Integer> a12= new ArrayList<Integer>();
		a12.add(600);
		a12.add(700);
		a1.addAll(a12);
		
		System.out.println(a12);
		
		
		
		a1.add(5);
		a1.add(10);
		a1.add(30);
		a1.add(40);
		//a1.clear();
		System.out.println(a1);
		a1.add(0,500);
		System.out.println(a1);
		System.out.println(a1.contains(900));
		System.out.println(a1.get(3));
		System.out.println(a1.indexOf(30));
		
		for(int i= 0; i<a1.size(); i++)
		{
			
			System.out.println(a1.get(i));
		}
		
		
		System.out.println("--------------------------");
	}


	
	
}


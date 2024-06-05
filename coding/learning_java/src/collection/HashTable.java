package collection;

import java.util.Hashtable;

public class HashTable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> map= new Hashtable<Integer, String>();
		

		map.put(10, "Steve");
		map.put(20, "Steve");
		map.put(30, "Steve");
		map.put(40, "Steve");
		map.put(50, "Steve");
		//map.put(null, null);
		System.out.println(map);
   
		
	}
	
}
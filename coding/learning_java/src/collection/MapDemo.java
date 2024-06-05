package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(10, "Steve");
		map.put(20, "Steve");
		map.put(30, "Steve");
		map.put(40, "Steve");
		map.put(50, "Steve");
		map.put(null, null);
		System.out.println(map);
   
		
		Collection<String> val= map.values();
		
		for(String str:val)
		{
			
			System.out.println(str);
		}
		
		
	}

}

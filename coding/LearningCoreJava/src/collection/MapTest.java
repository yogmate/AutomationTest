package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		System.out.println(map);
		map.put(1, 200);
		map.put(2, 200);
		map.put(3, 200);
		
	
		System.out.println(map);
		
		//map.clear();
		//System.out.println(map);
		
		System.out.println("===================");
		for(Entry e:map.entrySet())
		{
			System.out.println("key is : "+e.getKey() + "value is: " +e.getValue());
		}
		
	
		
		
		
	}

}

package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class CityName {

	
	public static void main(String[] args) {
		
		HashMap<String, String> capital= new HashMap<String, String>();
		capital.put("Karnataka", "Banglore");
		capital.put("Maharashtra", "mumbai");
		capital.put("UP", "Lacknow");
		
		System.out.println(capital);
		
		for(Entry<String, String> cap: capital.entrySet())
		{
			System.out.println(capital);
		}

	}
}

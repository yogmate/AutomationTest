package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Long> set= new HashSet<>();
		//System.out.println(set);
		set.add(1088l);
		set.add(2044l);
		//set.add(10);
		System.out.println(set);
		set.add(null);
		set.add(3000l);
		System.out.println(set);
		
		for(Long i:set)
		{
			System.out.println(i);
		}
		
		Set<Long> mobilenos= new HashSet<>();
		mobilenos.add(676577l);
		mobilenos.add(887979l);
		mobilenos.add(874544645l);
		mobilenos.add(8745454l);
		
		set.addAll(mobilenos);
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		set.add(78544521l);
		set.add(789445555l);
		System.out.println(set);
		
		set.remove(78544521l);
		System.out.println(set);
		
		
	}

}

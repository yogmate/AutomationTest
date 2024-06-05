package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	
	
public static void main(String[] args) {
	

	Set<Integer> s1= new LinkedHashSet();
	
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(10);
	s1.add(20);
	//s1.clear();
	
	
	System.out.println(s1);
}
}

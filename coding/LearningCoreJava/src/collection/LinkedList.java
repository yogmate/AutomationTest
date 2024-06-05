package collection;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	
	public static void main(String[] args) {
		
		
		List<String> al=new ArrayList<String>();   
		  al.add("Ravi");   
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");    
		    
		  List<String> al2=(List<String>) new LinkedList();    
		  al2.add("James");
		  
		  al2.add("Swati");    
		  al2.add("Junaid");    
		    
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  
		 }    
		   
		
		
		
	}


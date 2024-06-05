package exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3

{

	
	public static void read() throws FileNotFoundException
	
	{
		
		System.out.println(" read method called");
	}
	
   public static void main(String[] args)
   
   {
	
	   try
	   {
		   
		   read();
		   
	   }
	
   catch(FileNotFoundException e)
   {
	   System.out.println("hello exception");
	   
   }
   
}
}

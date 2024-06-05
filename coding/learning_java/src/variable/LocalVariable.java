package variable;

public class LocalVariable {

   String name= "Steve";
   {
	   int rollno= 1234;
	   System.out.println(" roll no from instance block: "+rollno);
	   System.out.println("instance block executed");
	   
   }
		
  static
  {
	  System.out.println("Static block executed");
	  int rollno=1234;
	  System.out.println("roll no from ststic block: "+rollno);
  }
	
  public static void name()
  {
	  int id= 100;
	  System.out.println(id);
	  
  }
  
  public static void main(String[] args) 
  
  {
		
  for(int i=1; i<=100; i++)
  {
	  LocalVariable local= new LocalVariable();
	  System.out.println("object creation counter "+i);
	  
}
}
}

package constructors;

public class Student1 {
	
	public Student1()
	{
		this(10);
		System.out.println("Default constructor");
	}
  public Student1(int a)
  {
	 this(10,20);
	  System.out.println("Default constructor with int value");
  }
  
  public Student1(int a, int b)
  {
	  
	  System.out.println("Default constructor int a & b values");
  }
  
  public static void main(String[] args) 
  
  {
	  Student1 obj= new Student1();
	  //Student1 obj1= new Student1(10);
	  //Student1 obj2= new Student1(10,20);
	  
}
}

package constructors;

public class Student 
{
//instance varibale belongs to objects
	
	
	int id= 10;
	String name= "Shubhangi";
	double percentage= 90.90;
	
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.percentage);
	}
	
}

package variable;

public class InstanceVariable1 {

	static int rollno= 100;
   
	
	public static void disprollno()
	{
		rollno=2000;
		
		System.out.println("my roll no is: "+rollno);
	}
	

	public static void main(String[] args) 
	{
		disprollno();
		System.out.println(rollno);
	}
	
	
}

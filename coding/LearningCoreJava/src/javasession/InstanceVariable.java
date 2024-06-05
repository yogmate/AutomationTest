package javasession;

public class InstanceVariable {
	
	String collegename= "";
	
	public void displaystudentdetails()
	{
		collegename= "ABC";
		System.out.println("college name: "+collegename);
	}
	
	public void displayprofessordetails()
	
	{
		collegename= "DEF";
		System.out.println("college name: "+collegename);
	}

	
	public static void main(String[] args) {
		
		InstanceVariable obj= new InstanceVariable();
		
		obj.displayprofessordetails();
		obj.displaystudentdetails();
		
	}
}

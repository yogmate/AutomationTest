package javasession;

public class StaticVariable {
	
	
	static int countrycodeid= 91;
	
	String location;
	
	public static void displaystudentinfo()
	{
		
		System.out.println("student country code is: "+countrycodeid);
	}
	
	public static void displaycompanyinfo()
	
	{
		System.out.println("company country code is: "+countrycodeid);
		
	}
	
	
	public static void main(String[] args) {
		
		
	System.out.println(StaticVariable.countrycodeid);
	StaticVariable.displaycompanyinfo();
	StaticVariable.displaystudentinfo();
		
	StaticVariable obj= new StaticVariable();
	obj.location= "Mumbai";
	System.out.println(obj.location);
	
	
		
	}

}

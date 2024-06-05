package variable;

public class StaticNonStatic
{
static String name= "IIT powai";

public void name()
{
   System.out.println(name);	
}

public static void main(String[] args) 
{
	StaticNonStatic obj= new StaticNonStatic();
	obj.name();
	
}
	
}

	



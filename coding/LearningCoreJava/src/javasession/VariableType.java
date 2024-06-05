package javasession;

public class VariableType {
	
	
	
int id= 100;
double marks= 99.09;
String name;
boolean javaeasy= true;
char grade= 'A';

public void display()

{
	
	name= "Shubhangi";
	System.out.println(name);
	
	name= "Mahesh";
	System.out.println("name");
}

public static void main(String[] args) {
	
	VariableType var= new VariableType();
	var.display();
	
	
	
}
}

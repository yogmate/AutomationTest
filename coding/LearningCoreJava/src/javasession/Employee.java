package javasession;

public class Employee {
	
	
	String empname;
	int id;
	
public static void main(String[] args) {
	Employee   emp1= new Employee();
	emp1.empname= "Shubhangi";
	emp1.id= 100;
	
	System.out.println("Employee1 details:  "+emp1.empname+" id : "+emp1.id);
	
	Employee  emp2= new Employee();
	emp2.empname= "Mahesh";
	emp2.id= 101;
	
	System.out.println("Employee2 details:  "+emp2.empname+"    id : "+emp2.id);
	
	
	
}
	

}

package inheritance;

public class A {

	public void add()
	{
		System.out.println("class A add method");
	}
	
	public void mul()
	{
		System.out.println("class A mul method");
	}	
}

class B extends A
{
	public void sub()
	
	{
		System.out.println("class B mul method");
		
	}
	
	public static void main(String[] args) {
		
		B obj= new B();
		obj.add();
		obj.mul();
		obj.sub();
		
	}
	
}





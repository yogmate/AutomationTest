package methodoverloading;

public class Test

{

	public void add(int a, int b)
	
	{
		
		int sum= a+b;
		System.out.println("sum: "+sum);

	}
	
	public void add(double a, double b)
	{
		
		double sum= a+b;
		System.out.println("sum: "+sum);
	}
	

	public static void main(String[] args) 
	{
		
		Test t= new Test();
		t.add(10, 20);
		t.add(10.10, 20.20);
		
	}
}



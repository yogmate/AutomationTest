package javasession;

public class Calculator {
	
	
	public int add(int num1, int num2)
	{

		int sum= num1 + num2;
		return sum;
		
	}
	
	public static int addintnumbers(int num1, int num2)
	{
		
		int sum= num1 + num2;
		return sum;
		
		
	}
	public static double adddoublenumbers(double num1, double num2)
	{
		
		double sum= num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(adddoublenumbers(100.10,200.10));
		System.out.println(addintnumbers(400,300));
	}
	

}

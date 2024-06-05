package javasession;

public class MethodOverloading {
	
	public static int add(int num1, int num2)
	{
		int sum= num1 + num2;
		return sum;
	}
	
	public static double add(double num1, double num2)
	{
		
		double sum= num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(100, 200));
		System.out.println(add(100.100, 10.10));
	}

}

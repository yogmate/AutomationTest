package javasession;

public class Operators {
	
	
	public static void add(int number1, int number2)
	
	{
		
	int sum= number1+number2;
	System.out.println(sum);
		
	}
	
public static void sub(int number1, int number2)
	
	{
		
	int sub= number1-number2;
	System.out.println(sub);
		
	}
	
	public static void main(String[] args) {
		
		int number1 = 100;
		int number2 = 200;
		
		System.out.println(number1 + number2);
		Operators.add(1000, 2000);
		
		System.out.println(number1 - number2);
		Operators.sub(500, 400);
		
		
		
	}

}

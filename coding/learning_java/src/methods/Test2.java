package methods;

public class Test2 {

	public static void display()
	
	{
      System.out.println("Hello world");		
	}
	 
	public static int add(int num1, int num2)
	
	{
		int sum = num1 + num2;
		return sum;
		
	}
	public static int sub(int num1, int num2)
	{
		int sum = num1 - num2;
		return sum;
	}
	
	public static void main(String[] args) 
	{
		display();
		int sum = add(100,200);
		System.out.println(sum);
		
		int sub = sub(300,200);
		System.out.println(sub);
		
		
		
	}
}

package exceptionhandling;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("before exception");
		
		try {
		
			System.out.println(100/0);
			
		} 
		
		catch (ArithmeticException e) {
			
			System.out.println(100/4);
			
		}
		
	
		
		System.out.println("after exception");
		
		
	}

}

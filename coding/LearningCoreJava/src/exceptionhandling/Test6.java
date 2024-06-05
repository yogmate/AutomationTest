package exceptionhandling;

public class Test6 {
	
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("access denied - age limit is 18 years");
		}
		else
		{
			System.out.println("access granted");
		}
	}
	public static void main(String[] args) {
		
		checkAge(21);
	}

}

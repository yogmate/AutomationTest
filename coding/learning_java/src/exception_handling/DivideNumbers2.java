package exception_handling;

import java.util.Scanner;

public class DivideNumbers2 {
	
	public static void main(String[] args) 
	
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		
		int number= 100;
		int div= scan.nextInt();
		
		try
		{
			System.out.println(number/div);
		}
		
		catch (ArithmeticException e )
		
		{
			
			System.out.println("ArithmeticException has been handled");
			
			e.printStackTrace();
			
		}
			System.out.println("after the division");
			
		
		
	}

}

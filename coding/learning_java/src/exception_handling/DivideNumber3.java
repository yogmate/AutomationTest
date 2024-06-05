package exception_handling;

import java.util.Scanner;

public class DivideNumber3 {

	public static void main(String[] args) 
	
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		
		int number= 100;
		int div= scan.nextInt();
		
		try {
			System.out.println(number/div);
		} catch (ArithmeticException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("after the division");

	}

}

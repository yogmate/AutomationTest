package exceptionhandling;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter your number...!!");
		int b= scan.nextInt();
		
		
		System.out.println("before exception");
		int a= 0;
		
		try {
		
 a= 100/b;
 
		}
		
		catch (ArithmeticException e) {
			
		
			a= 100/5;
			
		}
		System.out.println("A value is "+a);
		System.out.println("after exception");
		
		
	}

}

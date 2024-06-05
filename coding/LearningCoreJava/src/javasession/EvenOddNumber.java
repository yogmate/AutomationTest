package javasession;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		//int number= 32;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter the number for checking even or odd");
		
		int number= scan.nextInt();
		
		if(number%2==0)
			
		{
			
			System.out.println("Given no is even: "+number);
			
		}
		else
		{
			System.out.println("Given no is odd: "+number);
		}
	}

}

package javasession;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter the numbr");
		int day= scan.nextInt();
		
		
	//	int day= 9;
		
		
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
			
		case 3:
			System.out.println("Wednesday");
			
			
		case 4:
			System.out.println("Thursday");
			
			break;
		case 5:
			System.out.println("Friday");
			
			break;
		case 6:
			System.out.println("Saturday");
			
			break;
			
		case 7:
			System.out.println("Sunday");
			
			break;

		default:
			
			System.out.println("please enter input 1 to 7");
			break;
		}
	}

}

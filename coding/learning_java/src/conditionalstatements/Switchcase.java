package conditionalstatements;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) 
	{
		//String id= "fan 4";
		Scanner scan =  new Scanner(System.in);
		System.out.println("please enter the detail");
	    String id= scan.nextLine();
		switch (id) 
		{
		case "fan 1":
			System.out.println("This is for fan 1");
			break;
		case "fan 2" :
			System.out.println("This is for fan 2");
			break;
		case "fan 3":
			System.out.println("This is for fan 3");
			break;
		case "fan 4":
			System.out.println("This is for fan 4");
			
			
			break;

		default:
			System.out.println("This is default switch");
			break;
		}
	}

}

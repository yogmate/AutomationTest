package javasession;

import java.util.Iterator;

public class nestedLoop {
	
	public static void main(String[] args) {
		
		//outer loop
		for(int i=1; i<=2; i++)
		{
			System.out.println("outer: " +i);
			
			for(int j= 1; i<=3; j++)
			{
				System.out.println("inner : "+j);
			}
		}
	}

}

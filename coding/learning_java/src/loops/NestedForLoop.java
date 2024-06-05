package loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		//outer loop
		for(int i = 1; i<=20; i++)
		{
			System.out.println("outer:  " +i);
			
			//inner loop
			for(int j=1; j<=30; j++)
			{
				System.out.println("inner: " +j);
			}
		}

	}

}

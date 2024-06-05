package exceptionhandling;

public class Test8 {
	
	public static void main(String[] args) {
		

		System.out.println("started");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("ended");
	}

}

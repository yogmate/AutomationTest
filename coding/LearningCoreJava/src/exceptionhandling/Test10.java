package exceptionhandling;

public class Test10 {
	
	public static void add() throws InterruptedException
	{
		
		System.out.println("static method");
	}

	public static void main(String[] args) {
		
  try {
	add();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}
	
}

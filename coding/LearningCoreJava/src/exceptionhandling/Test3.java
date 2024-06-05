package exceptionhandling;

public class Test3 {
	
	public static void main(String[] args) {
		
		String str= null;
		
		
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			str= "Steve";
			System.out.println(str.length());
			//e.printStackTrace();
		}
		
		System.out.println("after exception");
	}

}

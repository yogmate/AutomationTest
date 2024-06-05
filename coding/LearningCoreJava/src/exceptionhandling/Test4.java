package exceptionhandling;

public class Test4 {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		System.out.println(arr[1]);
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			
		}
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10
		
	}

}

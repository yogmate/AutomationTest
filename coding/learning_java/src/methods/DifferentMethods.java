package methods;

public class DifferentMethods {

	public static String displayName()
	{
		return "       i am learning java for selenium";
		
	}
		public static void main(String[] args) {
			
			//System.out.println(displayName());
			//different methods
		String str= displayName();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.contains("java"));
		System.out.println(str.indexOf('m'));
		System.out.println(str.trim());
		
		
		}	
		
		
	

}

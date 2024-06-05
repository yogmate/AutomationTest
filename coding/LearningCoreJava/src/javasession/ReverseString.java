package javasession;

public class ReverseString {

	public static void main(String[] args) {
		
		String originalstr= "Hello";
		
		String reversedstr= "";
		
		System.out.println("original string: " + originalstr );
		
		for(int i=0; i<originalstr.length(); i++)
		{
			reversedstr= originalstr.charAt(i) + reversedstr;
			
			
		}
		
		System.out.println("reversed string:" +reversedstr);
	}
	
	
	
}

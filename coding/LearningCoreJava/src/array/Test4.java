package array;

public class Test4 {
	
	public static void main(String[] args) {
		
String[] emp= new String[4];
		
		emp[0]= "steve";
		emp[1]= "steve1";
		emp[2]= "steve2";
		emp[3]= "steve3";
		
		try {
			System.out.println(emp[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	

}

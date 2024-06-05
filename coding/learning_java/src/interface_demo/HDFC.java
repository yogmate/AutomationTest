package interface_demo;

public class HDFC implements RBI 
{
	
	public void getinterest()
	
	{
		System.out.println("HDFC get interest");
	}
	
	public static void main(String[] args) {
		RBI hdfc= new HDFC();
		hdfc.getinterest();
	}

}

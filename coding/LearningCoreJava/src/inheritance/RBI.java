package inheritance;

public class RBI {
	
	public int getrateofinterest()
	
	{
		return 6;
		
	}

}

class SBI extends RBI
{
	public int getrateofinterest()

	{
		
		return 7;
	}
}

class HDFC extends RBI
{
	public int getrateofinterest()

	{
		
		return 8;
	}
}

class Testbank
{
	
	public static void main(String[] args) {
		
		HDFC hdfc= new HDFC();
		int hdfcrate= hdfc.getrateofinterest();
		System.out.println("HDFC rate of interest is : "+hdfcrate);
		
		}
}
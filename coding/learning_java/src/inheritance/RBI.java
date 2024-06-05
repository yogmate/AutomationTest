package inheritance;

public class RBI {
	
	public void loan()
	{
		System.out.println("Loan from RBI");;
		
	}

}

class HDFC extends RBI
{

	public void homeloan()
	{
		
		System.out.println("home loan from HDFC");
	}

	
	public static void main(String[] args)
	
	{
		HDFC hdfc= new HDFC();
		hdfc.loan();
		hdfc.homeloan();
	}
	
	
}


	
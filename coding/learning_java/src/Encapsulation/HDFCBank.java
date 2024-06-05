package Encapsulation;

public class HDFCBank {
	
	private String accountnumber= "8264265865";
	private String accountbalance= "232332";
	private String accountholdername= "Shubhangi";
	
	public String getaccountnumber()
	{
		return accountnumber;
	}

	public String getaccountbalance()
	{
		
		return accountbalance;
	}
	
	public String getaccountholdername()
	{
		return accountholdername;
		
	}
	
	public static void main(String[] args)
	
	{
		HDFCBank obj= new HDFCBank();
		System.out.println(obj.accountnumber);
		System.out.println(obj.accountbalance);
		System.out.println(obj.accountholdername);
	}
}

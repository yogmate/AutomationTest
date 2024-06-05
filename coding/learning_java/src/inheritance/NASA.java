package inheritance;

public class NASA implements ISRO

{

	
	public void launchsetellite()
	
	{
		System.out.println(" NASA launchsetellite");
	}

	@Override
	public void launchlmv() 
	
	{
		System.out.println(" NASA launchlmv: " );
		
	}
	
	public static void main(String[] args) 
	
	{
		
		NASA nasa= new NASA();
		nasa.launchsetellite();
		nasa.launchlmv();
		
		
	}
}

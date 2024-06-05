package interfaceconcept;

public class HDFC implements RBI {

	@Override
	public double getrateofinterest() {
	
		return 8.7;
	}
	
public static void main(String[] args) {
		
		HDFC hdfc= new HDFC();
		
		double rateofinterest= hdfc.getrateofinterest();
		System.out.println(rateofinterest);
		
	}


}

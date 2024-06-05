package interfaceconcept;

public class SBI implements RBI {

	@Override
	public double getrateofinterest() {
		
		return 8.20;
	}
	
	public static void main(String[] args) {
		
		SBI sbi= new SBI();
		
		double rateofinterest= sbi.getrateofinterest();
		System.out.println(rateofinterest);
		System.out.println("monthly amount : " +monthlycharge);
		
	}

}

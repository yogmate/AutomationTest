package interfaceconcept;

public class Axis implements RBI {

	@Override
	public double getrateofinterest() {
		
		return 8.2;
	}
public static void main(String[] args) {
		
		Axis axis= new Axis();
		
		double rateofinterest= axis.getrateofinterest();
		System.out.println(rateofinterest);
		
	}


}

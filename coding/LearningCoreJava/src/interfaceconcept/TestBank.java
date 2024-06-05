package interfaceconcept;

public class TestBank implements Bank
{

	@Override
	public void display() {
	
		System.out.println("TestBank display method");
		
	}

	@Override
	public void add() {
		
		System.out.println("TestBank add method");
	}
	
	public static void main(String[] args) {
		TestBank bank= new TestBank();
		bank.add();
		bank.display();
		System.out.println("bankname: "+bank.bankname);
		System.out.println("bankname: "+bank.bankID);
		
	}
	
}
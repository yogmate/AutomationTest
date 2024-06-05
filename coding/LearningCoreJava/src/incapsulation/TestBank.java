package incapsulation;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank bank= new Bank();
		bank.setBalance(100000);
		bank.setCustomerid(1001);
		
		System.out.println(bank.getBalance());
		System.out.println(bank.getCustomerid());
	}

}

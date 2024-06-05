package incapsulation;

public class Bank {
	
	private int balance;
	int customerid;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public static void main(String[] args) {
		
		Bank bank= new Bank();
		
		//setter
	bank.setCustomerid(12345);
	bank.setBalance(1000);
	
		//getter
	System.out.println(bank.getCustomerid());
	System.out.println(bank.getBalance());
	
	
	}
}



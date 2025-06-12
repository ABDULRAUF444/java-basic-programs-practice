package edu.peters.session;

public class BankExceptionDemo {

	public static void main(String[] args) throws InSufficientBalanceException {
	
		SBIBank sbi = new SBIBank(5000);
		
		sbi.withdrawn(10000);
		sbi.withdrawn(7000);
		sbi.withdrawn(1000);
		
		sbi.deposit(10000);
		sbi.deposit(7000);
		sbi.deposit(1000);
		
	}

}
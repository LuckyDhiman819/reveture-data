package exceptinhandling;

import testing.AirthmaticOperationTest;

public class BankAccount {
	
	public void withdraw(int amount) throws InvalidAmountException, DailyLimitExeede  {
		if(amount<0) {
			throw new InvalidAmountException("cannot use negative number");
		}
		else if(amount>50000)
			throw new DailyLimitExeede("This is limit your amount");
		System.out.println("withdrawan");
		
	}
	public void diposite(int amount) throws InvalidAmountException, DailyLimitExeede {
		if(amount<0) {
			throw new InvalidAmountException("This is less then 0");
		}
		else if(amount>50000)
			throw new DailyLimitExeede("This is limit your amount");
		System.out.println("Diposited");
	}

public static void main(String[] args) throws Exception  {
	System.out.println("Welcome");
	BankAccount ba = new BankAccount();
	try {
		ba.withdraw(20);
		ba.diposite(-50);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println("Thanks For using this app");
}	

}


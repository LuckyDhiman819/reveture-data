package singleton;

public class Payment {
	
	private static Payment payment;
	
	private Payment() {
		// T
		System.out.println("Payment called");
	}
	
	public static Payment getPaymentObject() {
		if(payment==null) {
			payment = new Payment();
		}
		return payment;
	}
	
	public void withdraw(int amt) {
		System.out.println("Amount withdran");
	}

}

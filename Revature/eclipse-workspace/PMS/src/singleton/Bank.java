package singleton;

public class Bank {
	public static void main(String[] args) {
		
	Payment p1 = Payment.getPaymentObject();
	p1.withdraw(5000);
	Payment p2 = Payment.getPaymentObject();
	p2.withdraw(5000);
	Payment p3 = Payment.getPaymentObject();
	p3.withdraw(5000);
	}

}

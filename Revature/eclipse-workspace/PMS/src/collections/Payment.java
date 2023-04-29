package collections;

public class Payment implements Comparable<Payment> {
	
	/*		
	Create 5 objects and sort by 
	1. Sort by Payment Id  
	2. Sort by Payment Type 
	3. Sort by Amount
	4. Sort by Status 
	5. EXIT
	 */
	
	private int paymentId;
	private String paymentType;
	private int amount;
	private String status;

	public Payment() {
		// TODO Auto-generated constructor stub
	}
	
	public Payment(int paymentId, String paymentType, int amoun, String status) {
		// TODO Auto-generated constructor stub
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.amount = amoun;
		this.status = status;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPaymentId() {
		return paymentId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nPayment Id - "+paymentId+" Payment Type - "+paymentType+" amount - "+amount+" staus - "+status;
	}

	@Override
	public int compareTo(Payment o) {
		// TODO Auto-generated method stub
		if(o.getPaymentId()>this.getPaymentId()) {
			return -1;
		}
		return 1;
	}
	
	
}

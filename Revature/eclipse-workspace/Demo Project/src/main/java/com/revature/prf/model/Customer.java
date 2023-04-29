package com.revature.prf.model;

public class Customer {

	private int customerId;
	private String customerName;
	private int customerContact;
	private int customerBalance;
	private String customerPassword;
	private String customerAddress;
	private String customerStatus;

	// default constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor...
	public Customer(int customerId, String customerName, int customerContact, int customerBalance,
			String customerPassword, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerBalance = customerBalance;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;

	}

	public Customer(int customerId, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public int getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(int customerBalance) {
		this.customerBalance = customerBalance;
	}

	// getters and setters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + ", customerBalance=" + customerBalance
				+ ", customerStatus=" + customerStatus + "]";
	}

}

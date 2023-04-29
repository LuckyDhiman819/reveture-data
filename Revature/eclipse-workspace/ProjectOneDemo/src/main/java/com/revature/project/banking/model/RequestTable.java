package com.revature.project.banking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Request_Table")
public class RequestTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestId;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "MailID")
	private String emailId;

	@Column(name = "Password")
	private String password;

	@Column(name = "ContactNumber")
	private String mobileNumber;

	@Column(name = "Location")
	private String city;

	@Column(name = "balance")
	private int balance;

	@Column(name = "AccountType")
	private String accountType;

	@Column
	private Date registeredDate;

	public RequestTable() {
		// TODO Auto-generated constructor stub
	}

	public RequestTable(int customerId, String firstName, String lastName, String emailId, String password,
			String mobileNumber, String city, int balance, String accountType, Date registeredDate) {
		super();
		this.requestId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.balance = balance;
		this.accountType = accountType;
		this.registeredDate = registeredDate;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int customerId) {
		this.requestId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
}

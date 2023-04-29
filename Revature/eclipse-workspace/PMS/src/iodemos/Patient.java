package iodemos;

import java.io.Serializable;

public class Patient implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	long phoneNumber;
	String password;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public Patient(String name,long phoneNumber, String password) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+phoneNumber+password;
	}
	

}

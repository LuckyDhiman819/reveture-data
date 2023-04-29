package jdk8newfeature;

public class Patient implements Comparable<Patient> {
	
	int id;
	String name;
	int bill;
	String doctorName;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(int id,String name,int bill,String doctorName) {
		// TODO Auto-generated constructor stub
	
		this.id = id;
		this.name = name;
		this.bill = bill;
		this.doctorName = doctorName;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+name+bill+doctorName;
	}
	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

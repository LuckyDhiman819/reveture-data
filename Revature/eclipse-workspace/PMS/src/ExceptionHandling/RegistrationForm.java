package ExceptionHandling;

public class RegistrationForm {
	
	String name;
//	String maritalStatus;
	int age;
//	int sex;
//	String DOB;
//	String address;
//	String PrimaryEmailId;
//	String secondryEmailId;
	int phoneNumber;
//	String intrestedSubjects;
	String qualification;
	String national;
	
	public RegistrationForm() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RegistrationForm(String name, int age, int phoneNumber, String national, String qualification) {
		// TODO Auto-generated constructor stub
		this.name = name;
//		this.maritalStatus;
		this.age = age;
//		String sex;
//		String DOB;
//		String address;
//		String PrimaryEmailId;
//		String secondryEmailId;
		this.phoneNumber = phoneNumber;
//		String intrestedSubjects;
		this.qualification = qualification;
		this.national = national;
		
	}


}

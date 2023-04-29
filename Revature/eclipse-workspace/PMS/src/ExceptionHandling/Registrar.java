package ExceptionHandling;

public class Registrar extends Student {
	
	public Registrar() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
//	•	getRegistrar() –This method returns a registrar  
	
	public String getRegistrar() throws UniversityException {
		
		if(age<35 && age>23) {
			
			return "Yes";
		}
		else {
			return "No";
		}
	}
	
//	•	registerStudent(Student student) throws RegistrationException
	
	public String registerStudent(Student student) {
		
		student = new Student();
		if(student.phoneNumber>10000000) {
			return "No";
		}
		return "Yes";
		
	}
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome");
		
		new RegistrationForm("lucky", 2, 79888, "Hindu", "B.Tech");
		
		Student admisionid = new Student();
		
		admisionid.registerStudent();
//		admisionid.registerForExam(admisionid);
		System.out.println("Thak you for using this app");

		
		
	}


}

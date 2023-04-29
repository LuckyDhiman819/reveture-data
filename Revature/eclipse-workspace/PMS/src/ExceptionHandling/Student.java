package ExceptionHandling;

import java.util.Scanner;

public class Student extends RegistrationForm {
	
	Scanner sc = new Scanner(System.in);
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, int age, int phoneNumber, String national, String qualification) {
		
		
		RegistrationForm rf = new RegistrationForm(name, age, phoneNumber, national, qualification);
		
	}
	
	
	public void registerStudent() throws UniversityException {
				
		if(age>23) {
			
			throw new AgeException("Age Limit is 23 to 35");
			
		}
		else if(age<35)
			System.out.println("Age limit");
		else {
			System.out.println("registered");
		}
		
	}
	public void registerForExam(Student addmisionid) throws UniversityException {
		
//		
//		if() {
//			
//			throw new ValidteException("Your data is incorrect");
//		}
//		else {
//			System.out.println("registered");
//		}
		System.out.println("Welcome to Exam");	
		
	}
	public void appearForExam() throws UniversityException
	{
		
		System.out.println("your exm is submitted");
		
		
	}
}
	



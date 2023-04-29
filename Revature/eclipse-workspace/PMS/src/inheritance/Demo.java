package inheritance;


class Vehicle{
	int vehicleNumber;
	String vehicleName;
	int date;
	
	public void issueDate() {
		System.out.println(date);
		System.out.println(vehicleNumber);
		System.out.println(vehicleName);
	}
	
}

class Car extends Vehicle{	
	
	public void issueCar() {
		date = 1992;
		vehicleNumber = 20012;
		vehicleName = "Tata Tiago";
	}
	
	public void display() {
		System.out.println();
		issueDate();
	}
}
class Bike extends Vehicle{	
	
	public void issueBike() {
		date = 2005;
		vehicleNumber = 2135;
		vehicleName = "Hero Honda";
	}
	
	public void display() {
		issueDate();
	}
	public void issueDate() {
		System.out.println(date);
		System.out.println(vehicleNumber);
		System.out.println(vehicleName+ " Lucky Dhiman");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.issueCar();
		car.display();
		
		Bike bike = new Bike();
		bike.issueBike();
//		bike.display();
		bike.issueDate();

	}

}

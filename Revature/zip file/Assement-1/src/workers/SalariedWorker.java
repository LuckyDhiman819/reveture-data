package workers;

public class SalariedWorker extends Workers {
	
	String name;
	int numberOfHours;
	int salaryPerHours;
	
	public SalariedWorker() {
		// TODO Auto-generated constructor stub
	}
	
	public SalariedWorker(String name,int numberOfHours, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.numberOfHours = numberOfHours;
		this.salaryPerHours = salary;
		
		
	}
		
	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public int getSalaryPerHours() {
		return salaryPerHours;
	}

	public void setSalaryPerHours(int salaryPerHours) {
		this.salaryPerHours = salaryPerHours;
	}

	public int pay() {
		// TODO Auto-generated method stub
		int weekPay = numberOfHours*salaryPerHours;
		return weekPay;
	}
	
	@Override
	public String toString() {
		
		// TODO Auto-generated method stub
		return "\nworker name :- "+name+" number of Hours working"+numberOfHours+" salary per hour"+salaryPerHours+" with its total salary:- "+pay();
	}

}

package workers;

public class DailyWorker extends Workers {
	
	String name;
	int numberOFdays;
	int salaryPerday;
	
	public DailyWorker() {
		// TODO Auto-generated constructor stub
	}
	public DailyWorker(String name,int numberOfdays, int salaryPerday) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.numberOFdays = numberOFdays;
		this.salaryPerday = salaryPerday;
	}
	public int getNumberOFdays() {
		return numberOFdays;
	}
	public void setNumberOFdays(int numberOFdays) {
		this.numberOFdays = numberOFdays;
	}
	public int getSalaryPerday() {
		return salaryPerday;
	}
	public void setSalaryPerday(int salaryPerday) {
		this.salaryPerday = salaryPerday;
	}
	
	public int pay() {
		// TODO Auto-generated method stub
		int weekPay = this.salaryPerday*7;
		return weekPay;
	}
	
	@Override
	public String toString() {
		
		// TODO Auto-generated method stub
		return "\nworker name :- "+name+" number of days working"+numberOFdays+" salary per day"+salaryPerday+" with its total salary:- "+pay();
	}

}

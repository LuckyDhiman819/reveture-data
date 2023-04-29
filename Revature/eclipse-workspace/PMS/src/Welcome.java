import Finance.*;
import hr.finance.trainee.*;
public class Welcome {

	String employeeName = "Lucky Dhiman";

	public void messageFromCEO() {
		System.out.println("4. This Message from CEO " + employeeName);
	}

	public void printMessage() {
		System.out.println("2. This is message from printMessage");
		Welcome w = new Welcome();
		w.messageFromCEO();
		System.out.println("3. This is message from printMessage");
	}

	public static void main(String[] args) {
		System.out.println("1. My name is Khan");
		Welcome w = new Welcome();
//		w.printMessage();
//		System.out.println("5. Revature is best for me");
		
//		OrderDetails order = new OrderDetails();
//		order.orderStatus();
//		
//		Product pro = new Product();
//		pro.technicalProduct();
//		pro.manegmentProduct();
//		
//		StockDetails stock = new StockDetails();
//		stock.inStock();
//		stock.outOfStock();
//		
//		PaymentDetails pay = new PaymentDetails();
//		pay.onlinePayment();
//		pay.offlinePayment();
		
		PF pf  = new PF();
		pf.pfDedution();
		
		Salary sal = new Salary();
		sal.totalSalary();
		
		Employee emp = new Employee();
		emp.insideEmployeeName();
		
//		hr.Customer cust = new hr.Customer();
//		cust.coustomerName();
		
		hr.Employee emp2 = new hr.Employee();
		emp2.employeeName();
		
		
	}

}

class OrderDetails{
	public void orderStatus() {
		System.out.println("This is order details");
	}
}


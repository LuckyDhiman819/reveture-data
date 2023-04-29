package garbagedemo;

public class Employee {
	
	protected void finalize() {
		System.out.println("This is finalize function");
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		Employee e4 = e1;
		e2 = null;
		e1 = e2;
//		e4 = null;
		System.gc();
//		e3.finalize();
//		
		System.out.println("System call");
		
		
	}
}

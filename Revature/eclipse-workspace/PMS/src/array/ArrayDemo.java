package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.display();
		
		
		Employee emp[] = new Employee[5];
		
		for(int i = 0; i<emp.length; i++) {
			emp[i] = new Employee();
		}
		
		emp[1].display();

	}

}

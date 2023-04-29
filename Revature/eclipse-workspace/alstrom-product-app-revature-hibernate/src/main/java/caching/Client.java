package caching;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Kalpana");
		Employee e2 = new Employee(1, "Kalpana");
		

		System.out.println(e1==e2);			//false		//true		//false	
		System.out.println(e1.equals(e2));	//true		//true				//true	??
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}

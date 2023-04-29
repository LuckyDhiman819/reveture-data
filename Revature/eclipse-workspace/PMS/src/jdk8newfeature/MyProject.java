package jdk8newfeature;

public class MyProject {
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation() {
			
			@Override
			public int addNumbers(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.println(cal.addNumbers(12, 20));
		
		
		Calculation c = (a, b) -> {return a+b;};
		System.out.println(c.addNumbers(20, 20));
		
		Calculation c1 = (a,b)->a+b;
		System.out.println(c1.addNumbers(14, 10));
	}

}

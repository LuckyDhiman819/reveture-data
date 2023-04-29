package scope;

public class Z {
	
	
//	anomoys method
	{
		System.out.println("instance");
	}
	static
	{
		System.out.println("static");
	}
	W w = new W();
	public Z() {
		System.out.println("Z constructer");
	}
	
	
	public static void main(String[] args) {
		System.out.println("In main");
		new Z();
		new Z();
	}

}

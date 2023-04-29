package inheritance;


class ElectronicDevide{
	
	final int price;
	
	public ElectronicDevide() {
		price = 20;
		System.out.println("constructor");
	}
	public ElectronicDevide(String s) {
		price = 30;
		System.out.println("this is string+");
	}
	
	public void react() {
		System.out.println("Lucky Dhiman");
	}
}

class Mobile extends ElectronicDevide{
	public Mobile() {
//		super("lucky");
		System.out.println(super.price);
		
	}
	public Mobile(String s) {
		super(s);
		System.out.println("Mobile String");
		System.out.println(super.price);
		
//		super.react();
	}
}

public class ConstructorInvocation {	
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		
		Mobile m = new Mobile("tring");
		
		
		
	}
}

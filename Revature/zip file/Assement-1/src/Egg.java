import java.util.Scanner;

public class Egg {
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		int dozen = 0;
		int gross = 0;
		int remaiining = 0;
		
		System.out.println("ENtre the Quantity of egg:-");
		int egg = sc.nextInt();
		
		gross = (int) egg/144;
		
		dozen = (int) (egg%144)/12;
		
		
		remaiining = (int) (egg%144)%12;
		System.out.println("Your number of eggs is "+ gross+" gross, "+ dozen+"  dozen, and "+remaiining);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Egg egg = new Egg();
		egg.display();
		
	}

}

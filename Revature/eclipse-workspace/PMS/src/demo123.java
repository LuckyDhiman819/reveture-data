
import java.util.*;

class UserInputDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		int i = sc.nextInt();
		double j = sc.nextDouble();
		String str = sc.nextLine(); // reads string
		System.out.println("String: " + str);
		System.out.println("Double: " + j);
		System.out.println("Int: " + i);
	}
}

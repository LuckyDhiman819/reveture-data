package controlflow;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int date = sc.nextInt();
//		int month = sc.nextInt();
		System.out.println("entre the year");
		int year = sc.nextInt();
		int b = 0;
		
		if(1990<year&& year<=1995) {
			b = 1;
		}
		else if(1995<year && year<=2000) {
			b = 2;
		}
		else if(2000<year && year<=2010) {
			b =3;
		}
		else if(2010< year && year <=2021) {
			b = 4;
		}
		switch (b) {
		case (1):
			System.out.println("You are Early 90's born");	
			break;
		case (2):
			System.out.println("You are late 90's born");	
		break;
		case (3):
			System.out.println("You are new decade born");	
		break;
		case (4):
			System.out.println("You are recently born");	
		break;
		default:
			System.out.println("Invalid Year");
			
		}
	}
}

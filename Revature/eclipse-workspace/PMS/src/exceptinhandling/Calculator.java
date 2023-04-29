package exceptinhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public int addition(int a, int b) {
		int sum;
		sum = 0;
		try {
			sum = a+b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return sum;
	}
	public int substraction(int a, int b) {
		int sum = 0;
		try {
			sum = a-b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return sum;
	}
	public int multiplication(int a, int b) {
		int sum = 0;
		try {
			sum = a*b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return sum;
	}
	public int division(int a, int b) {
		int sum = 0;
		try {
			sum = a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Welcome");
		int a= 0, b=0, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the operation perfome only +,-,*,/");
		String s = sc.next();
		try {
			System.out.println("entre the first Number");
			a = sc.nextInt();
			System.out.println("entre the first Number");
			b = sc.nextInt();
		
		
		switch(s) {
		case "+":
			result = cal.addition(a, b);
			System.out.println(result);
			break;
		case "-":
			result = cal.substraction(a, b);
			System.out.println(result);
			break;
		case "*":
			result = cal.multiplication(a, b); 
			System.out.println(result);
			break;
		case "/":
			result = cal.division(a, b); 
			System.out.println(result);
			break;
		default:
			System.out.println("Wrnog Operator");
			System.exit(0);
		}
		}catch(ArithmeticException e){
			System.out.println("Can't divide a number by 0");
		}
		catch(InputMismatchException e){
			System.out.println("You entered invalid umber ");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Successfully executed");
			
		}
		
		
		
		
		
		
	}
	

}







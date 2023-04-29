package array;

import java.util.Date;
import java.util.Scanner;

public class Employee {
	
	
	public void display() {
		int numbers[] = new int [3];
//		@SuppressWarnings("resource")
		Scanner sc12 = new Scanner(System.in);
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = sc12.nextInt();
		}
		
		for(int i : numbers) {
			System.out.println(i);
		}
	}
//	@Target
	public void manySum(int a, int b, int c) {
		System.out.println(a+b+c);
		System.out.println(a+b+c);
		
	}
	public void manySum(int...arr) {
//		give many in one time 
		int sum = 0;
		for(int i:arr) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
//		emp.display();
		emp.manySum(1,2,3);
		
		Date d = new Date();
		System.out.println(d);
	}
	
	

}

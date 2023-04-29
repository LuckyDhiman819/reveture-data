package material;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Laptops l1 = new Laptops("Dell", "i10");
		Laptops l2 = new Laptops("Apple", "i6");
		Laptops l3 = new Laptops("Acer", "i9");
		Laptops l4 = new Laptops("HP", "i5");
		Laptops l5 = new Laptops("Asus", "AMD");
		
		
		Accessories a1 = new Accessories("Bags", 2000);
		Accessories a2 = new Accessories("Shoes", 2500);
		Accessories a3 = new Accessories("Sunglasses", 1000);
		Accessories a4 = new Accessories("Watch", 4000);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What are you looking for :- 1.Laptop or 2. Accessories \nEnter your choice : ");
		int i = sc.nextInt();
		System.out.println("Enter the number of quantities : ");
		int quantity = sc.nextInt();
		switch (i) {
		case 1:
			Laptops o = new Laptops();
			o.out(quantity);
			break;
		case 2:
			Accessories o2 = new Accessories();
			o2.out(quantity);
			break;
		default:
			System.out.println("You have chosen the wrong option!!!\nEXITING!!!");
			break;
		}
	}

}
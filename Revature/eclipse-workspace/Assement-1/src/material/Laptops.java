package material;

import stock.Inventory;

public class Laptops extends Inventory {
	int quantity = 1000;
	int lowOrderLevelQuantity = 3;
	String processor;
	String name;

	public Laptops() {
		
	}

	public Laptops(String processor, String name) {
		super();
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
		this.processor = processor;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Laptop [quantity=" + quantity + ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + ", processor=" + processor + ", name=" + name + "]";
	}

	public void out(int q) {
		if (q < quantity && q > lowOrderLevelQuantity)
			System.out.println("Order Placed");
		else if (q < lowOrderLevelQuantity)
			System.out.println("Requesting Material");
		else {
			System.out.println("Item not found");
		}
	}
}
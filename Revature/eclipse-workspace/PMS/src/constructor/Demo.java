package constructor;

public class Demo {
	
	String productName;
	int productID;
	int quantityOnHand;
	int price;
	
	public Demo() {
		productName = "Lucky";
		productID = 1001;
		quantityOnHand = 50;
		price = 5000;
	}
	
	public Demo(String productName, int productID, int quantityOnHand, int price) {
		this("lll",1,1);
		this.productName = productName;
		this.productID = productID;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	
	public Demo(String productName, int productID, int quantityOnHand) {
		this();
		this.productName = productName;
		this.productID = productID;
		this.quantityOnHand = quantityOnHand;
	}
	
	public Demo(int productID, String productName, int price) {
		this();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	public void display() {
		System.out.println(this.productID);
		System.out.println(this.productName);
		System.out.println(this.quantityOnHand);
		System.out.println(this.price);
	}
	

	public static void main(String[] args) {
		
		Demo d = new Demo(10001001, "Lucky", 1212);
//		new Demo();
		d.display();
//		System.out.println(d);
		
		
	}

}

package stock;

public class Inventory {
	private int quantity;
	private int lowOrderLevelQuantity;
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getLowOrderLevelQuantity() {
		return lowOrderLevelQuantity;
	}

	public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}
	
	public boolean cheakQuantity() {
		
		if(this.quantity> this.lowOrderLevelQuantity)
			return true;
		else
			return false;
		
	}
	

}

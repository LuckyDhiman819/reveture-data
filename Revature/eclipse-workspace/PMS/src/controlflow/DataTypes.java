package controlflow;

public class DataTypes {
	int num;
	IfElse w = new IfElse();
	
	public DataTypes(int num) {
		super();
		this.num = num;
	}
//	public DataTypes(int num) {
//		super();
//		this.num = num;
//	}

	public void DataTypes() {
		System.out.println("Lukcy");
	}
	
	public void display() {
		
		final int p = 10;
		byte pp = p;
		
		int a = 65;
		char c = (char) a;
		
		int x = 0;
		System.out.println(num);
		System.out.println(x);
		if(num==0) {
			x = 100;
			System.out.println(num);
			System.out.println(x);
		}
		System.out.println(num);
		
		System.out.println(x);
	}
	

	public static void main(String[] args) {
//		final int i = 20;
//		int num = 10;
//		short x = i;
//		System.out.println(i);
		DataTypes dis = new DataTypes(20);
		dis.display();
	}
}

package collections;


public class Demo3 implements Comparable<Demo3>{
	private String name;
	private int number;
	private int empid;
	private int price;
	public Demo3() {
	
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getEmpid() {
		return empid;
	}


	public Demo3(String name, int number, int empid, int price) {
		// TODO Auto-generated constructor stub
		
		this.name =name;
		this.number = number;
		this.empid = empid;
		this.price = price;
	}
	
	public String toString() {
		String str = ("Name is "+ name +" and Phone nUmber is "+number+" and Price is "+price+" and emoid is "+empid);
		return str;
	}
	@Override
	public int compareTo(Demo3 o) {
		// TODO Auto-generated method stub
		if(o.getPrice() > this.getPrice()) {
			return -1;
		}
		return 1;

	}
	

}

package stingdemo;

public class demo {
	
	public static void main(String[] args) {
		String str1 = "Lucky";
		String str = str1.concat("Dhiman");
		System.out.println(str);
		str = new String("Lucky");
		String str2 = new String("Lucky");
		
		System.out.println(str2.equals(str));
		System.out.println(str2==str);
		
		System.out.println(str1==str);
		System.out.println(str1.equals(str));
		
		System.out.println(str1.equalsIgnoreCase(str));
		
		str1 = "Lucky Dhiman";
//		String str3 = str1.substr);
		
		System.out.println(str.equals(str2));
		
	}

}

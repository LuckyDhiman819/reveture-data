package stringAdditionalExercise;

public class Immutability {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(str.charAt(12));
		
		String arr[] = str.split(" ");
		int count = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]=="is") {
				System.out.println("Yes");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("No");
		}
		
		String str2 = str.concat(" and killed it");
		
		System.out.println(str2);
		
		int len = arr.length-1;
		System.out.println(arr[len].equals("dog"));
		
		System.out.println(str.equals("The quick brown Fox jumps over the lazy Dog"));
		
		System.out.println(str.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		
		System.out.println("length of string "+ str.length());
		
		System.out.println(str==("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
	
		String replaceString=str.replaceAll("The","A");
		System.out.println(replaceString);
		
		String[] twoMethod = str.split("jumps");
		System.out.println(twoMethod[0]);
		System.out.println(twoMethod[1]);
		
		
		for(String i: arr) {
			if(i.equals("fox") || i.equals("dog")) {
			System.out.println(i);	
			}
			
		}
		
		String strLower = str.toLowerCase();
		System.out.println(strLower);
		
		String strupper = str.toUpperCase();
		System.out.println(strupper);
		String a = "a";
		
		int indexOfA = str.indexOf("a");
		System.out.println("a is in index of "+ indexOfA);
		
//		String x = "e";
		int index = -1;
	    for (int i = 0; i < str.length(); i++)
	        if (str.charAt(i) == 'e')
	            index = i;
	    System.out.println(index);
		
		
		
	}

}

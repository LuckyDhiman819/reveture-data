package stringAdditionalExercise;

public class StringBuilder {

	public static void main(String[] args) {
		String arr[] = {"Lucky", "fgh","gfd","gfd","htre","ytfv","tbh","d","htredf","gfds"};
		
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i];
		}
		System.out.println(str);
	}
	
	
}

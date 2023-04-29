package stringAdditionalExercise;

public class Anagram {
	public static void main(String[] args) {
		
		String a = "ate";
		String b = "eat";
		String x, x1;
		int count = 0;
		
		
		
		if(a.length()==b.length()){
		    for(int i = 0; i<a.length(); i++){
		        for(int j = 0; j<b.length(); j++){
		            if(a.charAt(i)==b.charAt(j)){
		                x = b.substring(0, j);
		                x1 = b.substring(j+1, b.length());
		                b = x+x1;
		                count++;
		            }
		        }
		    }
		    if(count==a.length()){
		        System.out.println("YES");
		    }
		    else{
		    	System.out.println("FALSE");
		    }
		}
		else{
			System.out.println("FALSE");
		}
	}

}

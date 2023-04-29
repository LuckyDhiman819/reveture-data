package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearch {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		
		names.add("Lucky");
		names.add("rohn");
		names.add("gagan");
		names.add("chran");
		names.add("dhram");
		names.add("veer");
		
		Collections.sort(names);
		System.out.println(names);
		
		int result  = Collections.binarySearch(names, "chran");
		
		System.out.println(result);
		
		
		
	}

}
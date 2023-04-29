package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
	List<Integer> marks = new ArrayList<Integer>();
	
	marks.add(10);
	marks.add(25);
	marks.add(45);
	marks.add(10);
	marks.add(65);
	marks.add(45);
	marks.add(52);
	marks.add(56);
	marks.add(45);
	marks.add(47);
	
	Iterator<Integer> iterator = marks.iterator();
	
	while(iterator.hasNext()) {
		int temp = iterator.next();
		if(temp>=15) {
			System.out.println(temp);
		}
	}
	
	}

	
}

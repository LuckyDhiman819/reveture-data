package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> emp = new TreeMap<Integer, String>();
		
		emp.put(1, "Lucky");
		emp.put(2, "Lucky");
		emp.put(3, "Lucky");
		emp.put(4, "Lucky");
		emp.put(5, "Lucky");
		
		for(Integer empId: emp.keySet()) {
			System.out.println(empId);
		}
		
		for(String empName: emp.values()) {
			System.out.println(empName);
		}
		
		for(Entry<Integer, String> data : emp.entrySet()) {
			System.out.println(data.getValue() + " "+data.getKey());
		}
		
		
		
		
	}

}

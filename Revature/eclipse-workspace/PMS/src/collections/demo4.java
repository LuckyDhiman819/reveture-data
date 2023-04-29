package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 demo = new Demo3("Name", 798857819, 123, 15550);
		
		List<Demo3> emp = new ArrayList<Demo3>();
		
		emp.add(demo);
		emp.add(new Demo3("Sohan", 78585, 284, 1));
		emp.add(new Demo3("Rohan", 7855, 234, 50));
		emp.add(new Demo3("Mohan", 7885, 236, 10));
		
		Iterator<Demo3> iterator = emp.iterator();
		
		while(iterator.hasNext()) {
			
			Demo3 temp = iterator.next();
			System.out.println(temp);
			
		}
		
		
		System.out.println("Ater the sortation of price");
		
		Iterator<Demo3> iterator2 = emp.iterator();
		
		while(iterator2.hasNext()) {
			
			Demo3 temp = iterator2.next();
			System.out.println(temp);
			
		}
		Collections.sort(emp, new EmpIdComparator());
		System.out.println("Ater the sortation of empid");
		
		Iterator<Demo3> iterator3 = emp.iterator();
		
		while(iterator3.hasNext()) {
			
			Demo3 temp = iterator3.next();
			System.out.println(temp);
			
		}
		
//		we can implemented only using anoynomus class
		Collections.sort(emp, new Comparator<Demo3>() {

			

			@Override
			public int compare(Demo3 o1, Demo3 o2) {
				// TODO Auto-generated method stub
				if(o1.getName().compareTo(o2.getName())>0) {
					return 1;
				}
				else
					return -1;
			}
		
			
		});
		System.out.println("Ater the sortation of empid");
		
		Iterator<Demo3> iterator4 = emp.iterator();
		
		while(iterator4.hasNext()) {
			
			Demo3 temp = iterator4.next();
			System.out.println(temp);
			
		}
		
		
		
		

		
	}

}

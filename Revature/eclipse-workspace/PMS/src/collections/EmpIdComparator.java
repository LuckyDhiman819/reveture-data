package collections;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Demo3> {
	

	@Override
	public int compare(Demo3 o1, Demo3 o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice() > o2.getPrice()) {
			return -1;
		}
		return 1;
	}

}

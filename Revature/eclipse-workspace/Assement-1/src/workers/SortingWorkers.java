package workers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWorkers {
	
	public static void main(String[] args) {
		
		List<DailyWorker> dailyworker = new ArrayList<DailyWorker>();
		List<SalariedWorker> salariedworker = new ArrayList<SalariedWorker>();
		
		dailyworker.add(new DailyWorker("Ramu",  15, 200));
		dailyworker.add(new DailyWorker("Gyan",  10, 210));
		dailyworker.add(new DailyWorker("Neeraj", 13,200));
		dailyworker.add(new DailyWorker("Ashish", 9, 230));
		
		salariedworker.add(new SalariedWorker("Ramu",  15, 200));
		salariedworker.add(new SalariedWorker("Gyan",  10, 210));
		salariedworker.add(new SalariedWorker("Neeraj", 13,200));
		salariedworker.add(new SalariedWorker("Ashish", 9, 230));
		
		System.out.println(salariedworker);
		
		Collections.sort(salariedworker, new Comparator<SalariedWorker>() {

			@Override
			public int compare(SalariedWorker o1, SalariedWorker o2) {
				// TODO Auto-generated method stub
				if(o1.pay()>o2.pay())
					return 1;
				else
					return -1;
			}
			
		});
		System.out.println(salariedworker);
		System.out.println();
		System.out.println(dailyworker);
		
		Collections.sort(dailyworker, new Comparator<DailyWorker>() {

			@Override
			public int compare(DailyWorker o1, DailyWorker o2) {
				// TODO Auto-generated method stub
				if(o1.pay()>o2.pay())
					return 1;
				else
					return -1;
			}

			
		});
		
		System.out.println(dailyworker);
		
		
		
	}

}

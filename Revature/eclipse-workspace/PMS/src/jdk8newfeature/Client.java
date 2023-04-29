package jdk8newfeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		List<Patient> patient = new ArrayList<Patient>();
		
		patient.add(new Patient(8, "Lucky",1452,"Ramukaka"));
		patient.add(new Patient(4, "mucky",1452,"Ramukaka"));
		patient.add(new Patient(9, "Lucky",1452,"Ramukaka"));
		patient.add(new Patient(2, "Lucky",1452,"Ramukaka"));
		patient.add(new Patient(6, "Lucky",1452,"Ramukaka"));
		
		
		Collections.sort(patient, new Comparator<Patient>(){

			@Override
			public int compare(Patient o1, Patient o2) {
				// TODO Auto-generated method stub
				if(o1.id>o2.id) {
					return 1;
				}
				return -1;
			}
			
		});
		
		System.out.println(patient);
		
		
		Comparator<Patient> allPatient = (o1, o2) -> {
			if(o1.id > o2.id) {
				return 1;
			}
			return -1;
			
		};
//		Comparator<Patient> comparator = (o1, o2) ->  o1.getBillAmount() > o2.getBillAmount()?1:-1;
//		Collections.sort(l,comparator);
//		System.out.println(l);

		Collections.sort(patient, allPatient);
		System.out.println();
		System.out.println(patient);
		
		
		Comparator<Patient> allofPatient = (o1, o2) -> o1.name.compareTo(o2.name);
		
		Collections.sort(patient, allofPatient);
		System.out.println();
		System.out.println(patient);
		
	}

}

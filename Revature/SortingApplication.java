package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Payment
	paymentId
	paymentType
	amount
	status		
Create 5 objects and sort by 
1. Sort by Payment Id  
2. Sort by Payment Type 
3. Sort by Amount
4. Sort by Status 
5. EXIT
 */
public class SortingApplication {
	
	
	public void sortPaymentId(List<Payment> payment) {
		
		Collections.sort(payment);
		System.out.println(payment);
				
	}
	
	public void sortPaymentType(List<Payment> payment) {
		
		Collections.sort(payment, new Comparator<Payment>() {

			@Override
			public int compare(Payment o1, Payment o2) {
				// TODO Auto-generated method stub
				if(o1.getPaymentType().compareTo(o2.getPaymentType())>0) {
					return 1;
				}
				return -1;
			}
		});
		System.out.println(payment);
				
	}
	public void sortAmount(List<Payment> payment) {
		
		Collections.sort(payment, new Comparator<Payment>() {

			@Override
			public int compare(Payment o1, Payment o2) {
				// TODO Auto-generated method stub
				if(o1.getAmount()>o2.getAmount()) {
					return 1;
				}
				return -1;
			}
		});		System.out.println(payment);
		
	}
	public void sortStatus(List<Payment> payment) {
		
		Collections.sort(payment, new Comparator<Payment>() {

			@Override
			public int compare(Payment o1, Payment o2) {
				// TODO Auto-generated method stub
				if(o1.getStatus().compareTo(o2.getStatus())>0) {
					return 1;
				}
				return -1;
			}
		});		
		System.out.println(payment);
		
	}
	
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		SortingApplication sort = new SortingApplication();
		Payment pay = new Payment(1221, "Flying mode", 45454, "filling");
		
		List<Payment> payment = new ArrayList<Payment>();
		payment.add(pay);
		payment.add(new Payment(4005, "Online mode", 85000, "done"));
		payment.add(new Payment(4008, "Treveling mode",45612, "pending"));
		payment.add(new Payment(4078, "Cash mode", 45875, "landing"));
		payment.add(new Payment(4074, "Parsal mode", 45860, "ontheway"));
		payment.add(new Payment(4012, "Narsal mode", 54580, "jaihind"));
		System.out.println("This is your details---->");
		System.out.println(payment);
		
		
		while(true) {
			System.out.println();
			System.out.println("How you are get sorted <press accordingly>");
			System.out.println("Press 1. Sort by Payment Id"); 
			System.out.println("Press 2. Sort by Payment Type"); 
			System.out.println("Press 3. Sort by Amount"); 
			System.out.println("Press 4. Sort by Status"); 
			System.out.println("Press 5. EXIT"); 
			a = sc.nextInt();
			
			switch(a) {
			case 1:
				sort.sortPaymentId(payment);
				System.out.println();
				break;
			case 2:
				sort.sortPaymentType(payment);
				System.out.println();
				break;
			case 3:
				sort.sortAmount(payment);
				System.out.println();
				break;
			case 4:
				sort.sortStatus(payment);
				System.out.println();
				break;
			case 5:
				System.exit(0);
				break;
				
			}
		}
		
	}

}

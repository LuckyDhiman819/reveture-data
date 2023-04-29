import java.util.Scanner;

public class TaxSlab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		System.out.println("Enter Gender as M or F : ");
		String gender = sc.nextLine();
		// System.out.println("You have entered: "+gender);

		System.out.println("INCOME: ");
		int Income = sc.nextInt();
		// System.out.println("You have entered: "+Income);

		System.out.println("year: ");
		int year = sc.nextInt();
		// System.out.println("You have entered: "+year);

		if (gender.equals("M")) {

			if (Income <= 180000) {
				System.out.println("NO TAX");
			} else if (Income >= 180001 && Income <= 500000) {
				System.out.println("10%");

			} else if (Income >= 500001 && Income < 800000) {
				System.out.println("20%");

			} else if (Income >= 800000) {
				System.out.println("30%");

			}

		}

		else if (gender.equals("F")) {
			if (year == 2011 || year == 2012) {
				if (Income >= 190000) {
					System.out.println("NO TAX");
				} else if (Income >= 190001 && Income <= 500000) {
					System.out.println("10%");

				} else if (Income >= 500001 && Income < 800000) {
					System.out.println("20%");
				} else if (Income >= 800000) {
					System.out.println("30%");

				}
			}
		}

	}

}

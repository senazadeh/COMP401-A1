package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int numberOfCustomers = scan.nextInt();
		
		String[] firstNames = new String[numberOfCustomers];
		String[] lastNames = new String[numberOfCustomers];
		double[] totals = new double[numberOfCustomers];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			totals[i] = 0;
			String firstName = scan.next();
			firstNames[i] = firstName;
			String lastName = scan.next();
			lastNames[i] = lastName;
			int numberOfIteams = scan.nextInt();
			for (int j = 0; j < numberOfIteams; j++) {
				int quantity = scan.nextInt();
				String iteamName = scan.next();
				double price = scan.nextDouble();
				totals[i] += quantity * price;
			}
		}
		scan.close();
		
		for (int i = 0; i < numberOfCustomers; i++) {
			System.out.println(firstNames[i].charAt(0) + ". " + lastNames[i] + ": " + String.format("%.2f", totals[i]));
		}
	}
}

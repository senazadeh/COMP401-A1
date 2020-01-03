package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);

		int numberOfIteams = s.nextInt();
 		
 		String[] iteams = new String[numberOfIteams];
 		double[] prices = new double[numberOfIteams];
 		
		for (int i = 0; i < numberOfIteams; i++) {
			String nameOfIteam = s.next();
			iteams[i] = nameOfIteam;
			double priceOfIteam = s.nextDouble(); 
			prices[i] = priceOfIteam;
		}
		
		int numberOfCustomers = s.nextInt();
		
		String[] firstNames = new String[numberOfCustomers];
		String[] lastNames = new String[numberOfCustomers];
		double[] totals = new double[numberOfCustomers];

		for (int i = 0; i < numberOfCustomers; i++) {
			String firstName = s.next();
			firstNames[i] = firstName;
			String lastName = s.next();
			lastNames[i] = lastName;
			int numberOfIteamsBought = s.nextInt();
			for (int j = 0; j < numberOfIteamsBought; j++) {
				int quantity = s.nextInt();
				String iteam = s.next();
				double priceOfIteam = 0;
				for (int k = 0; k < iteams.length; k++) {
					if (iteams[k].equals(iteam)) {
						priceOfIteam = prices[k];
						totals[i] += quantity * priceOfIteam;
					}
				}
			}
		}
		s.close();
		
		double biggestTotal = 0;
		for (int i = 0; i < totals.length; i++) {
			if (totals[i] > biggestTotal) {
				biggestTotal = totals[i];
			}
		}
		
		double smallestTotal = 999999999;
		for (int i = 0; i < totals.length; i++) {
			if (totals[i] < smallestTotal) {
				smallestTotal = totals[i];
			}
		}
		
		String biggestSpenderFirstName = "";
		String biggestSpenderLastName = "";
		for (int i = 0; i < totals.length; i++) {
			if (totals[i] == biggestTotal) {
				biggestSpenderFirstName = firstNames[i];
				biggestSpenderLastName = lastNames[i];
			}
		}
		String smallestSpenderFirstName = "";
		String smallestSpenderLastName = "";
		for (int i = 0; i < totals.length; i++) {
			if (totals[i] == smallestTotal) {
				smallestSpenderFirstName = firstNames[i];
				smallestSpenderLastName = lastNames[i];
			}
		}
		
		double sumOfTotals = 0;
		for (int i = 0; i < totals.length; i++) {
			sumOfTotals += totals[i]; }
		double average = sumOfTotals / totals.length;

		System.out.println("Biggest: " + biggestSpenderFirstName + " " + biggestSpenderLastName + " (" + String.format("%.2f", biggestTotal) + ")");
		System.out.println("Smallest: " + smallestSpenderFirstName + " " + smallestSpenderLastName + " (" + String.format("%.2f", smallestTotal) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
 	}
}

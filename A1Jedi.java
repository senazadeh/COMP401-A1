package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] numberOfIteamsBought = new int[numberOfCustomers];
		int[] numberOfEachIteamBought = new int[numberOfIteams];
		boolean[] didCustomerBuy = new boolean[numberOfIteams];
		int[] numberOfCustomersBought = new int[numberOfIteams];
		for (int i = 0; i < numberOfCustomersBought.length; i++) {
			numberOfCustomersBought[i] = 0;
		}
		
		for (int i = 0; i < numberOfCustomers; i++) {
			for (int j = 0; j < didCustomerBuy.length; j++) {
				didCustomerBuy[j] = false; 
			}
			String firstName = s.next();
			firstNames[i] = firstName;
			String lastName = s.next();
			lastNames[i] = lastName;
			int numberOfIteamBought = s.nextInt();
			numberOfIteamsBought[i] = numberOfIteamBought;
			for (int h = 0; h < numberOfIteamBought; h++) {
				int quantity = s.nextInt();
				String iteamName = s.next();
				for (int k = 0; k < iteams.length; k++) {
					if (iteams[k].equals(iteamName)) {
						didCustomerBuy[k] = true;
					}
				}
				for (int k = 0; k < iteams.length; k++) {
					if (iteams[k].equals(iteamName)) {
						numberOfEachIteamBought[k] += quantity;
					}
				}
			}
			for (int l = 0; l < didCustomerBuy.length; l++) {
				if (didCustomerBuy[l] == true) {
					numberOfCustomersBought[l]++;
				}
			}
		}
		s.close();
		
		
		
		for (int g = 0; g < iteams.length; g++) {
			if (numberOfCustomersBought[g] == 0) {
				System.out.println("No customers bought " + iteams[g]);
			} else {
				System.out.println(numberOfCustomersBought[g] + " customers bought " + numberOfEachIteamBought[g] + " " + iteams[g]);
			}
		}
 	}
}

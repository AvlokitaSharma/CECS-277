package project10;

import java.util.Scanner;

// Credit Card Demo..
public class CreditCardDemo {

	// Main method to run the program..
	public static void main(String[] args) {

		// Card Factories..
		CardFactory visaFactory = new VisaFactory(100000, 0);
		CardFactory discoverFactory = new DiscoverFactory(50000, 75);
		CardFactory americanFactory = new AmericanExpressFactory(500000, 100);

		// starting the program..
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Banking\n" + "=======================");
		String option = "";
		// menu for the option..
		while (!option.equalsIgnoreCase("quit")) {

			System.out.print("\n" + " AmericanExpress\n" + " Visa\n"
					+ " Discover\n" + " Quit\n\n"
					+ "Enter the card type you would like to visit: ");
			option = scan.nextLine().trim();
			
			CardFactory type = null;
			if (option.equalsIgnoreCase("quit")) {
				break;
			} else if (option.equalsIgnoreCase("AmericanExpress")) {
				type = americanFactory;
			} else if (option.equalsIgnoreCase("Discover")) {
				type = discoverFactory;
			} else if (option.equalsIgnoreCase("Visa")) {
				type = visaFactory;
			} else {
				System.out.println("Select appropriate option.");
			}
			
			System.out.println("\nYour card details are below :\n\n" + type.GetCreditCard().toString());

		}
		System.out.println("Exiting the program..Good bye");

		// closing the program..
		scan.close();

	}

}

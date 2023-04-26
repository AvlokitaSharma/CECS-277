//Avlokita Sharma
//12/15/2021
//Practice 1


import java.util.Scanner;

// Calculator..
public class Calculator {

	// Main method..
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to calculator.py");
		int option = 0;
		do {
			
			System.out.print("your options are:\n"
					+ "1) Addition\n"
					+ "2) Subtration\n"
					+ "3) Multiplication\n"
					+ "4) Division\n"
					+ "5) Quit calculator.py\n"
					+ "Choose your option: ");
			option = scan.nextInt();
			System.out.println();
			double num1 = 0, num2 = 0, result = 0;
			if (option >= 1 && option <= 4) {
				System.out.print("Enter number 1: ");
				num1 = scan.nextDouble();
				System.out.print("Enter number 2: ");
				num2 = scan.nextDouble();
			}
			switch (option) {
				
				case 1:
					result = num1 + num2;
					break;
				case 2:
					result = num1 - num2;
					break;
				case 3:
					result = num1 * num2;
					break;
				case 4:
					result = num1 / num2;
					break;
				case 5:
					System.out.println("Thank you for using it!");
					break;
				default:
					System.out.println("Only valid options are accepted.");
					break;
				
			}
			if (option >= 1 && option <= 4) {
				System.out.printf("Result: %.2f\n\n", result);
			}
			
		} while (option != 5);
		scan.close();
		
	}

}

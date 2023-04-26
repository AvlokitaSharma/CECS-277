//Avlokita Sharma
//Practice2
//Decemeber152021

import java.util.ArrayList;
import java.util.Scanner;

// Employee project.
public class EmployeeProject {

	// Main method..
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		System.out.println("Welcome to Employee Project");
		int option = 0;
		do {

			System.out.print("your options are:\n" + "1) Add a new Employee\n"
					+ "2) Remove an Employee\n" + "3) Search for an Employee\n"
					+ "4) Display the list of Employees\n"
					+ "5) Quit the program exit()\n" + "Choose your option: ");
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			switch (option) {

				case 1 :
					System.out.print("Enter Employee Name: ");
					String name = scan.nextLine();
					System.out.print("Enter Employee Salary: ");
					double salary = Double.parseDouble(scan.nextLine());
					employees.add(new Employee(name, salary));
					System.out.println("Employee added successfully!");
					break;
				case 2 :
					System.out.print("Enter Employee Name: ");
					name = scan.nextLine();
					boolean found = false;
					for (int i = 0; i < employees.size(); i++) {
						if (employees.get(i).getName().equalsIgnoreCase(name)) {
							found = true;
							employees.remove(i);
							System.out
									.println("Employee removed successfully!");
							break;
						}
					}
					if (!found) {
						System.out.println(
								"Employee with name '" + name + "' not found!");
					}
					break;
				case 3 :
					System.out.print("Enter Employee Name: ");
					name = scan.nextLine();
					found = false;
					for (int i = 0; i < employees.size(); i++) {
						if (employees.get(i).getName().equalsIgnoreCase(name)) {
							found = true;
							System.out.println("Employee found!, Salary: $"
									+ employees.get(i).getSalary());
							break;
						}
					}
					if (!found) {
						System.out.println(
								"Employee with name '" + name + "' not found!");
					}
					break;
				case 4 :
					for (int i = 0; i < employees.size(); i++) {
						System.out.println("Employee: "
								+ employees.get(i).getName() + ", Salary: $"
								+ employees.get(i).getSalary());
					}
					break;
				case 5 :
					System.out.println("Thank you for using the program!");
					break;
				default :
					System.out.println("Only valid options are accepted.");
					break;

			}
			System.out.println();

		} while (option != 5);
		scan.close();

	}

}

//Avlokita Sharma
//Practice2
//Decemeber152021

// Employee Tester..
public class EmployeeTester {

	// Main method..
	public static void main(String[] args) {
		
		Employee harry = new Employee("Hacker, Harry", 5000);
		System.out.println("Employee Name: " + harry.getName());
		System.out.println("Employee Salary: " + harry.getSalary());
		System.out.println("Raising salary by 10%");
		harry.raiseSalary(10);
		System.out.println("Employee Salary: " + harry.getSalary());
		
	}
	
}

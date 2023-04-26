//Avlokita Sharma
//Practice2
//Decemeber152021

// Employee..
public class Employee {

	//  Attributes..
	private String name;
	private double salary;
	
	// Constructor..
	public Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
		
	}
	
	// methods..
	public String getName() {
		
		return name;
		
	}
	
	public double getSalary() {
		
		return salary;
		
	}
	
	public void raiseSalary(double byPercent) {
		
		this.salary += ((salary * byPercent) / 100);
		
	}
	
}

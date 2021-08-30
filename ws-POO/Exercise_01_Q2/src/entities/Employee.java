package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return this.grossSalary - this.tax;
	}
	
	
	public double IncreaseSalary(double percentage) {
		double result = (this.grossSalary * (percentage / 100) + this.grossSalary) - this.tax;
		System.out.println("\nUpdated data: " + this.name + " $ " + result );
		return result;
	}
	
	public void MostrarRelatorio() {
		System.out.println("\nEmployee: " + this.name + " $ " + NetSalary());
	}
	
	
}

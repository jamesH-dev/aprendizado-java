package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();		
		func.MostrarRelatorio();
		
		System.out.print("\nWitch percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.IncreaseSalary(percentage);
		
		sc.close();
	}

}

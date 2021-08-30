import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double salario, calc1, calc2, calc3, total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o valor do Salário?:");
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("Isento!");
		}
		else if (salario > 2000.00 && salario <= 3000.00 ) {
			calc1 = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", calc1);
		}
		else if (salario > 3000.00 && salario <= 4500.00 ) {
			calc1 = (salario - 3000.00);
			calc2 = (salario - calc1 - 2000.00);
			total = (calc1 * 0.18) + (calc2 * 0.08);
			System.out.printf("R$ %.2f%n", total);
		}
		else {
			calc1 = (salario - 4500.00);
			calc2 = (salario - calc1 - 3000.00);
			calc3 = (salario - calc1 - calc2 - 2000.00);
			total = (calc1 * 0.28) + (calc2 * 0.18) + (calc3 * 0.08);
			System.out.printf("R$ %.2f%n", total);
		}
		
		sc.close();

	}

}

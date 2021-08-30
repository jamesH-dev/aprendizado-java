import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		double horas, salarioHora, salarioTotal;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		salarioHora = sc.nextDouble();
		horas = sc.nextDouble();
		salarioTotal = horas * salarioHora;
						
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = R$ %.2f%n", salarioTotal);
		sc.close();

	}

}

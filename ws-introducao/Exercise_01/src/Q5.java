import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorUnPeca1, valorTotalPeca1, valorUnPeca2, valorTotalPeca2, totalCompra;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorUnPeca1 = sc.nextDouble();		
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorUnPeca2 = sc.nextDouble();
		
		valorTotalPeca1 = numPeca1 * valorUnPeca1;
		valorTotalPeca2 = numPeca2 * valorUnPeca2;
		
		totalCompra = valorTotalPeca1 + valorTotalPeca2;
						
		System.out.printf("VALOR A PAGAR = %.2f%n", totalCompra);
		sc.close();

	}

}

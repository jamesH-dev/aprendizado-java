import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double nota1, nota2, nota3, mediaPonderada = 0;
		String result = "";
		for (int i = 0; i < n; i++) {
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/(nota1+nota2+nota3);
			result += (String) mediaPonderada;
		}
		System.out.printf("%.2f%n", result);
		sc.close();
	}

}

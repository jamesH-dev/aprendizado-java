import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double raio;
		double pi = 3.14159;
		double area;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);				
		System.out.printf("A = %.4f%n", area);
		sc.close();

	}

}

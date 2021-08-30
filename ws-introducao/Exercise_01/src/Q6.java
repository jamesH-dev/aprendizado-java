import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double A, B, C, areaTrianguloR, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();		
		
		areaTrianguloR = A * C / 2.0;
		areaCirculo = pi * Math.pow(C, 2.0);
		areaTrapezio = ((A + B) * C) / 2.0;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		System.out.printf("TRIÂNGULO = %.3f%n", areaTrianguloR);
		System.out.printf("CÍRCULO = %.3f%n", areaCirculo);
		System.out.printf("TRAPÉZIO = %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
		System.out.printf("RETÂNGULO = %.3f%n", areaRetangulo);
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double X, Y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do Eixo X do Plano Cartesiano:");
		X = sc.nextDouble();
		System.out.println("Digite o valor do Eixo Y do Plano Cartesiano:");
		Y= sc.nextDouble();
		
		if (X > 0 && Y > 0) {
			System.out.println("Q1");
		}
		else if (X == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (Y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		}
		else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		}
		else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}
		
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que será avaliado:");
		x = sc.nextDouble();
		
		//  ([0,25], (25,50], (50,75], (75,100]) 
		if (x  >= 0.0 && x <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (x > 25.0 && x <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		
		else if (x > 50.0 && x <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}
		
		else if (x > 75.0 && x <= 100.0) {
			System.out.println("Intervalo (75,100]");
		}
		
		
		else {
			System.out.println("Fora de intervalo!");
		}
		
		sc.close();

	}

}

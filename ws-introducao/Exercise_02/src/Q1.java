import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n?mero inteiro");
		x = sc.nextInt();
		if	(x >= 0) {
			System.out.println("N?O NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}

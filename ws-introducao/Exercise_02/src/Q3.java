import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro");
		x = sc.nextInt();
		System.out.println("Digite o segundo n�mero inteiro");
		y = sc.nextInt();
		if	((x % y == 0) || (y % x == 0)) {
			System.out.println("S�o M�ltiplos");
		}
		else {
			System.out.println("N�o s�o M�ltiplos");
		}
		
		
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x, y, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o hor�rio inicial do game");
		x = sc.nextInt();
		System.out.println("Digite o hor�rio final do game");
		y = sc.nextInt();
		
		if ((x >= 0 && x <= 24) && (y >= 0 && y <= 24)) {
		
			if	(x < y) {
				h = y - x;
			}
			else {
				h = (24 + y) - x;
			}
			System.out.printf("O JOGO DUROU %d HORA(S)", h);
		}
		else {
			System.out.println("HORA DIGITADA INV�LIDA");

		}
		
		sc.close();

	}

}

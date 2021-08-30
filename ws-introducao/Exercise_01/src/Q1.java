import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int soma;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;		
		sc.close();
		System.out.println("SOMA = " + soma);

	}

}

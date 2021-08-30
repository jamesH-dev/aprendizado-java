import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B, C, D, R;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		R = A * B - C * D;				
		System.out.println("DIFERENÇA = " + R);
		sc.close();

	}

}

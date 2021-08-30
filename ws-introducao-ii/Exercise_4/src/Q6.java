import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 0;
		
		for (int i = 1; i <= n; i++) {
			div = n % i;
			if (div == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

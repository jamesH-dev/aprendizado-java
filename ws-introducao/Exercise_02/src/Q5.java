import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cod, quant;
		double valor = 0, total = 0;
		String nome = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto desejado");
		cod = sc.nextInt();
		
		if (cod == 1) {
			valor = 4.0;
			nome = "Cachorro Quente";
			System.out.printf("Quantos %s você deseja?\n", nome);
			quant = sc.nextInt();
			total = quant * valor;
			System.out.println("\n\nPedido efetuado com sucesso!");
			System.out.printf("%d %s ---------- Valor Total: R$ %.2f\n", quant, nome, total);
		}
		
		else if (cod == 2) {
			valor = 4.5;
			nome = "X-Salada";
			System.out.printf("Quantos %s você deseja?\n", nome);
			quant = sc.nextInt();
			total = quant * valor;
			System.out.println("\n\nPedido efetuado com sucesso!");
			System.out.printf("%d %s ---------- Valor Total: R$ %.2f\n", quant, nome, total);
		}
		
		else if (cod == 3) {
			valor = 5.0;
			nome = "X-Bacon";
			System.out.printf("Quantos %s você deseja?\n", nome);
			quant = sc.nextInt();
			total = quant * valor;
			System.out.println("\n\nPedido efetuado com sucesso!");
			System.out.printf("%d %s ---------- Valor Total: R$ %.2f\n", quant, nome, total);
		}
		
		else if (cod == 4) {
			valor = 2.0;
			nome = "Torradas Simples";
			System.out.printf("Quantas %s você deseja?\n", nome);
			quant = sc.nextInt();
			total = quant * valor;
			System.out.println("\n\nPedido efetuado com sucesso!");
			System.out.printf("%d %s ---------- Valor Total: R$ %.2f\n", quant, nome, total);
		}
		
		else if (cod == 5) {
			valor = 1.5;
			nome = "Refrigerantes";
			System.out.printf("Quantos %s você deseja?\n", nome);
			quant = sc.nextInt();
			total = quant * valor;
			System.out.println("\n\nPedido efetuado com sucesso!");
			System.out.printf("%d %s ---------- Valor Total: R$ %.2f\n", quant, nome, total);
		}
		
		else {
			System.out.println("Código Inválido, inicie o programa novamente!");
		}
		
		sc.close();

	}

}

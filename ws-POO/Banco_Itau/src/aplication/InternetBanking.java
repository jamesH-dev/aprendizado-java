package aplication;

import java.util.Scanner;

import entities.Conta;

public class InternetBanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1;
		
		
		System.out.println("##########################################");
		System.out.println("#         INTERNET BANKING - ITA?        #");
		System.out.println("##########################################\n");
		System.out.println("Cadastro de Contas Banc?rias");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		System.out.print("Informe o n?mero da Conta: ");
		int numConta = sc.nextInt();
		System.out.print("Informe o nome do Titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();		
		System.out.print("Deseja informar dep?sito inicial? (s/n): ");
		char opcao = sc.next().charAt(0);
		if (opcao == 's' || opcao == 'S') {
			System.out.print("Digite o valor do dep?sito inicial: R$ ");
			double depInicial = sc.nextDouble();
			conta1 = new Conta(numConta, nomeTitular, depInicial);
		} else {
			conta1 = new Conta(numConta, nomeTitular);
		}
		
		System.out.println("\n\nCONTA CRIADA COM SUCESSO!");
		System.out.println(conta1);


		System.out.println("Novo Dep?sito");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Informe o valor do dep?sito: R$ ");
		double valDeposito = sc.nextDouble();
		conta1.Deposito(valDeposito);		
		
		System.out.println("\nSITUA??O DA CONTA ATUALIZADA!");
		System.out.println(conta1);
		
		System.out.println("Novo Saque");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Informe o valor do saque: R$ ");
		double valSaque = sc.nextDouble();
		conta1.Saque(valSaque);		
		
		System.out.println("\nSITUA??O DA CONTA ATUALIZADA!");
		System.out.println(conta1);
		
		sc.close();

	}

}

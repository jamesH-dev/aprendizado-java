package aplication;

import java.time.LocalDateTime;
import java.util.Scanner;

import entities.Reserva;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Reserva vect[] = new Reserva[10];
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora);
		System.out.println("##########################################");
		System.out.println("#          HOTEL UNI?O - CONTROLE        #");
		System.out.println("##########################################\n");
		System.out.println("Cadastro de Reservas");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Quantas reservas ser?o cadastradas? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("\nQual ? o nome do cliente? ");
			sc.nextLine();
			String nomeCliente = sc.nextLine();
			System.out.print("Qual ? o email do cliente? ");
			String emailCliente = sc.nextLine();
			System.out.print("Qual quarto deseja reservar? ");
			int quartoCliente = sc.nextInt();
			vect[quartoCliente] = new Reserva(nomeCliente, emailCliente);
		}
		
		System.out.println("\n\nQuartos ocupados");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
			
		
		
		sc.close();
	}

}

package aplication;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		
		a.nome = sc.nextLine();
		a._1trim = sc.nextDouble();
		a._2trim = sc.nextDouble();
		a._3trim = sc.nextDouble();
		a.Situacao();
		sc.close();

	}

}

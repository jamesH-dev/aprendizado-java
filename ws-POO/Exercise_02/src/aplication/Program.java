package aplication;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bougth? ");
		double dollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.Converter(price, dollar));
		
		sc.close();

	}

}

package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle a;
		a = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		a.width = sc.nextDouble();
		a.height = sc.nextDouble();
		
		System.out.println(a.toString());
		
		
		sc.close();
	}

}

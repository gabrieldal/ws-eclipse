package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double x = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double y = sc.nextDouble();
		
		double c = CurrencyConverter.converter(y, x);
		System.out.printf("Amount to be paid in reais = %.2f", c);
		
	
		
		
		
		
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle x;
	
		x = new Rectangle();

		System.out.println("Informe o valor da base: ");
		x.Width = sc.nextDouble();
		System.out.println("Informe o valor da altura: ");
		x.Heigth = sc.nextDouble();
		
		System.out.printf("A area do retangulo: %.2f", x.area());
		System.out.printf("o perimetro do retangulo: %.2f", x.perimeter());
		System.out.printf("A diagonal do retangulo: %.2f", x.diagonal());
		
		
		sc.close();
	}

}

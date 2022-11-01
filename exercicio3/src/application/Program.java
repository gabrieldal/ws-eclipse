package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informe o nome do aluno: ");
		student.nome = sc.nextLine();
		System.out.println("informe as notas: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("%s, %.2f, %.2f, %.2f", student.nome, student.nota1, student.nota2, student.nota3);
		System.out.println();
		double guardaNotaF = student.notaFinal();
		System.out.printf("Nota Final: %.2f", guardaNotaF);
		System.out.println();
		student.passa(guardaNotaF);
		
		sc.close();
	}

}

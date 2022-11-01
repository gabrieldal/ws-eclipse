package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.println("informe o nome do funcionario: ");
		x.nome = sc.nextLine();
		System.out.println("informe o valor do salario bruto do funcionario: ");
		x.salarioBruto = sc.nextDouble();
		System.out.println("informe o valor do imposto do funcionario: ");
		x.imposto = sc.nextDouble();
		
		System.out.printf("Funcionario : %s, R$%.2f",x.nome,x.salarioBruto);
		System.out.println();
		System.out.printf("Salario Liquido: %.2f", x.salarioLiquido());
		System.out.println();
		System.out.println("Qual É a porcentagem de aumento no salario?");
		double percentagem = sc.nextDouble();
		x.salarioAumento(percentagem);
		
		System.out.println();
		System.out.printf("Valores atualizados: " + x);
		
		sc.close();
	}

}

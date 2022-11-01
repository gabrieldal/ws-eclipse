package Mercado;

import java.util.Scanner;
import Mercado.*;


public class Main {
	
	public static Cliente NovoCliente(Scanner input) {
	System.out.println("Informe o nome do cliente: ");
	String nome = input.nextLine();
	System.out.println("Informe o CPF do cliente: ");
	String CPF = input.nextLine();
	Cliente fulano = new Cliente(nome, CPF);
	System.out.print(fulano);
	return fulano;
	}
	
	public static Pedido NovoPedido(Scanner input) {
		System.out.println("Informe como vai pagar seu pedido");
		String TipoPagamento = input.nextLine();
		Pedido pedido = new Pedido(TipoPagamento);
		System.out.print(TipoPagamento);
		return pedido;
	}
			
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		NovoCliente(input);
	}
}

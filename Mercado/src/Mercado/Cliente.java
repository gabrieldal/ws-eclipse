package Mercado;

public class Cliente {
private String nome;
private String CPF;

public Cliente(String nome, String cPF2) {
	this.nome = nome;
	this.CPF = cPF2;
}
public String toString() {
	String toString = String.format("Cliente: %s %s", nome, CPF);
return toString;
	}
	
}
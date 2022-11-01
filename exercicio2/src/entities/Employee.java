package entities;

public class Employee {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void salarioAumento(double percentagem) {
		salarioBruto += salarioBruto * percentagem/100;
	}
	
	public String toString() {
		return nome + ",R$ " + String.format("%.2f", salarioLiquido());
	}
}

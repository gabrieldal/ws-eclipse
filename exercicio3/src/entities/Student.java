package entities;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return (nota1 + nota2 + nota3)/3;
	}
	public void passa(double notaF) {
		if(notaFinal() >= 6.0) {
			System.out.println("Passou!");
		}else {
			System.out.println("Ahhh, nao vai dar...");
		}
	}
	public String toString() {
		return nome + "," + String.format("%.2f", notaFinal());
	}
}

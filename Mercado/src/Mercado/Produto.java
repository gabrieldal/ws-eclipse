package Mercado;

public class Produto {
private Descricao descricao;
private double preco;
private int QuantidadeEstoque;

public Produto(Descricao descricao, double preco, int QuantidadeEstoque) {
	this.descricao = descricao;
	this.preco = preco;
	this.QuantidadeEstoque = QuantidadeEstoque;
}
}

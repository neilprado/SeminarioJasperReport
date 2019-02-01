package modelo;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, String desc, double preco, int quant){
		this.nome = nome;
		this.descricao = desc;
		this.preco = preco;
		this.quantidade = quant;
	}
	
	public Produto() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}

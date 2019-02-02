package modelo;

import java.util.ArrayList;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private int estoque;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Produto(String nome, String desc, double preco, int estoque){
		this.nome = nome;
		this.descricao = desc;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public Produto() {}
	
	public void adicionarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void removerCliente(Cliente c) {
		this.clientes.remove(c);
	}

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

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
}
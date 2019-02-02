package modelo;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToMany(mappedBy="pedido", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private ArrayList<Produto> produtos = new ArrayList<>();
	@OneToOne
	private Cliente cliente;
	private int quantidade;
	
	public Pedido() {}
	
	public void adicionarProduto(Produto p) {
		this.produtos.add(p);
		p.setPedido(this);
	}
	
	public void removerProduto(Produto p) {
		this.produtos.remove(p);
		p.setPedido(null);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", quantidade=" + quantidade + "]";
	}
}

package fachada;

import java.util.List;

import daojpa.DAO;
import daojpa.DAOCliente;
import daojpa.DAOProduto;
import modelo.Cliente;
import modelo.Produto;

public class Fachada {
	private static DAOProduto daoproduto = new DAOProduto();
	private static DAOCliente daocliente = new DAOCliente();


	public static void inicializar() {
		DAO.open();
	}
	
	public static void finalizar() {
		DAO.close();
	}
	
	//Cadastros
	public static Cliente cadastrarCliente(String nome, String cidade, String telefone) throws Exception {
		DAO.begin();
		Cliente c = daocliente.buscarCliente(nome);
		if(c != null)
			throw new Exception("Cliente " + nome + " j� cadastrado");
		c = new Cliente(nome, cidade, telefone);
		daocliente.create(c);
		DAO.commit();
		return c;
	}
	
	public static Produto cadastrarProduto(String nome, String descricao, double preco, int quant) throws Exception {
		DAO.begin();
		Produto p = daoproduto.buscarProduto(nome);
		if(p != null)
			throw new Exception("Produto " + nome + " j� cadastrado");
		p = new Produto(nome, descricao, preco, quant);
		daoproduto.create(p);
		DAO.commit();
		return p;
	}
	
	// Remo��es
	public static Cliente removerCliente(String nome) throws Exception{
		DAO.begin();
		Cliente c = daocliente.buscarCliente(nome);
		if(c == null)
			throw new Exception("Cliente " + nome + " n�o encontrado");
		daocliente.delete(c);
		DAO.commit();
		return c;
	}
	
	public static Produto removerProduto(String nome) throws Exception{
		DAO.begin();
		Produto p = daoproduto.buscarProduto(nome);
		if(p == null)
			throw new Exception("Produto " + nome + " inexistente");
		daoproduto.delete(p);
		DAO.commit();
		return p;
	}
	
	//Atualiza��es
	public static void atualizarCliente(String nome, String novoNome) throws Exception{
		DAO.begin();
		Cliente c = daocliente.buscarCliente(nome);
		if(c == null)
			throw new Exception("Cliente " + nome + " n�o encontrado");
		c.setNome(novoNome);
		daocliente.update(c);
		DAO.commit();
	}
	
	public static void atualizarProduto(String nome, String novoNome) throws Exception{
		DAO.begin();
		Produto p = daoproduto.buscarProduto(nome);
		if(p == null)
			throw new Exception("Produto "+ nome + " inexistente");
		p.setNome(novoNome);
		daoproduto.update(p);
		DAO.commit();
	}
	
	//Listagens
	
	public static String listarClientes() {
		List<Cliente> clientes = daocliente.readAll();
		String texto = "Listagem de clientes: \n";
		for(Cliente c: clientes)
			texto += c.getNome() + "\n";
		return texto;
	}
	
	public static String listarPedidos() {
		List<Produto> produtos = daoproduto.readAll();
		String texto = "Listagem de produtos: \n";
		for(Produto p: produtos)
			texto += p.getNome() + " \n";
		return texto;
	}
	
}


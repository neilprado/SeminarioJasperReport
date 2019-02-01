package Fachada;

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
			throw new Exception("Cliente " + nome + " já cadastrado");
		c = new Cliente(nome, cidade, telefone);
		daocliente.create(c);
		DAO.commit();
		return c;
	}
	
	public static Produto cadastrarProduto(String nome, String descricao, double preco, int quant) throws Exception {
		DAO.begin();
		Produto p = daoproduto.buscarProduto(nome);
		if(p != null)
			throw new Exception("Produto " + nome + " já cadastrado");
		p = new Produto(nome, descricao, preco, quant);
		daoproduto.create(p);
		DAO.commit();
		return p;
	}
	
}


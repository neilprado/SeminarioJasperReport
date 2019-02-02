package aplicacao;

import fachada.Fachada;
import modelo.Cliente;
import modelo.Produto;

public class Cadastrar {
	
	public Cadastrar() {
		Fachada.inicializar();
		Cliente c;
		Produto p;
		
		try {
			System.out.println("Cadastrando...");
			
			c = Fachada.cadastrarCliente("Neil", "Recife", "123456789");
			p = Fachada.cadastrarProduto("Processador", "Ryzen 2600", 870.00, 30);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Fachada.finalizar();
		System.out.println("Fim do programa");
	}
	
	public void cadastrar() {
		
	}
	
	public static void main(String[] args) {
		new Cadastrar();
	}
}

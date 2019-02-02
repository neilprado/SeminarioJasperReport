package aplicacao;

import fachada.Fachada;
import modelo.Artista;

public class Cadastrar {
	
	public Cadastrar() {
		Fachada.inicializar();
		try {
			System.out.println("Cadastrando...");
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

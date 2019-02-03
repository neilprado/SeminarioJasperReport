package aplicacao;

import fachada.Fachada;

public class Atualizar {
	public Atualizar() {
		Fachada.inicializar();
		try {
			System.out.println("Atualizando...");
			Fachada.atualizarAlbum("El Diablo", "Grande Nazione");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Fachada.inicializar();
		System.out.println("Fim do Programa");
	}
	
	public static void main(String[] args) {
		new Atualizar();
	}
}

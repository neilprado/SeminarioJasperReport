package aplicacao;

import fachada.Fachada;

public class Listar {
	public Listar() {
		Fachada.inicializar();
		try {
			System.out.println("Listando...");
			System.out.println(Fachada.listarAlbuns());
			System.out.println(Fachada.listarArtistas());
			System.out.println(Fachada.listarMusicas());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Fachada.finalizar();
		System.out.println("Fim do Programa");
	}
	
	public static void main(String[] args) {
		new Listar();
	}
}

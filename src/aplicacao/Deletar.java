package aplicacao;

import fachada.Fachada;

public class Deletar {
	public Deletar() {
		Fachada.inicializar();
		try {
			System.out.println("Deletando...");
			Fachada.removerMusica("Ich tu dir weh");
			Fachada.removerArtista("Ville Valo and the Agents");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Fachada.finalizar();
		System.out.println("Fim do Programa");
	}
	
	public static void main(String[] args) {
		new Deletar();
	}
}

	package aplicacao;

import fachada.Fachada;
import modelo.Album;
import modelo.Artista;
import modelo.Musica;

public class Cadastrar {
	
	public Cadastrar() {
		Fachada.inicializar();
		Artista a;
		Album al;
		Musica m;	
		try {
			System.out.println("Cadastrando...");
			a = Fachada.cadastrarArtista("Neil Young", "EUA");
			al = Fachada.cadastrarAlbum("Harvest", a);
			m = Fachada.cadastrarMusica("Heart of Gold", al, 191);
			a = Fachada.cadastrarArtista("A-Ha", "Noruega");
			al = Fachada.cadastrarAlbum("Hunting High and Low", a);
			m = Fachada.cadastrarMusica("Take on Me", al, 250);
			m = Fachada.cadastrarMusica("Hunting High and Low", al, 280);
			al = Fachada.cadastrarAlbum("East of the Sun, West of the Moon", a);
			m = Fachada.cadastrarMusica("Crying in the Rain", al, 233);
			a = Fachada.cadastrarArtista("Zaz", "França");
			al = Fachada.cadastrarAlbum("Recto Verso", a);
			m = Fachada.cadastrarMusica("Je Veux", al, 200);
			m = Fachada.cadastrarMusica("On Ira", al, 230);
			m = Fachada.cadastrarMusica("Sous le Ciel de Paris", al, 180);
			m = Fachada.cadastrarMusica("Qué Vendrá", al, 178);
			a = Fachada.cadastrarArtista("Rodrigo Amarante", "Brasil");
			al = Fachada.cadastrarAlbum("Narcos", a);
			m = Fachada.cadastrarMusica("Tuyo", al, 117);
			a = Fachada.cadastrarArtista("Rammstein", "Alemanha");
			al = Fachada.cadastrarAlbum("Sehnsucht", a);
			m = Fachada.cadastrarMusica("Engel", al, 265);
			m = Fachada.cadastrarMusica("Sehnsucht", al, 244);
			al = Fachada.cadastrarAlbum("Liebe ist für alle da", a);
			m = Fachada.cadastrarMusica("Frühling im Paris", al, 285);
			m = Fachada.cadastrarMusica("Führe Mich", al, 274);
			m = Fachada.cadastrarMusica("Ich tu dir weh", al, 302);
			al = Fachada.cadastrarAlbum("Rosenrot", a);
			m = Fachada.cadastrarMusica("Rosenrot", al, 235);
			m = Fachada.cadastrarMusica("Reise Reise", al, 411);
			m = Fachada.cadastrarMusica("Amerika", al, 227);
			a = Fachada.cadastrarArtista("Stromae", "França");
			al = Fachada.cadastrarAlbum("Racine Carrée", a);
			m = Fachada.cadastrarMusica("Alors on Danse", al, 209);
			m = Fachada.cadastrarMusica("Papaoutai", al, 232);
			a = Fachada.cadastrarArtista("Liftiba", "Itália");
			al = Fachada.cadastrarAlbum("El Diablo", a);
			m = Fachada.cadastrarMusica("Elettrica", al, 251);
			a = Fachada.cadastrarArtista("Gogol Bordello", "Ucrânia");
			a = Fachada.cadastrarArtista("Ramji Ki Chal", "Índia");
			a = Fachada.cadastrarArtista("Ville Valo and the Agents", "Finlândia");
			
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

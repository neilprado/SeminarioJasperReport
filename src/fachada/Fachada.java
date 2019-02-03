package fachada;

import java.util.List;

import daojpa.DAO;
import daojpa.DAOAlbum;
import daojpa.DAOArtista;
import daojpa.DAOMusica;
import modelo.Album;
import modelo.Artista;
import modelo.Musica;

public class Fachada{
	private static DAOArtista daoartista = new DAOArtista();
	private static DAOAlbum daoalbum = new DAOAlbum();
	private static DAOMusica daomusica = new DAOMusica();
	
	public static void inicializar() {
		DAO.open();
	}
	
	public static void finalizar() {
		DAO.close();
	}
	
	//Cadastros
	
	public static Album cadastrarAlbum(String nome, Artista a) throws Exception{
		DAO.begin();
		
		Album al = daoalbum.listarPorNome(nome);
		if(al != null)
			throw new Exception("Álbum " + nome + " já existente");
		al = new Album(nome, a);
		if(al.getNome() == null)
			throw new Exception("Nome indisponível");
		a.adicionar(al);
		daoalbum.create(al);
		DAO.commit();
		return al;
	}
	
	public static Musica cadastrarMusica(String nome, Album a, int duracao) throws Exception{
		DAO.begin();
		Musica m = daomusica.buscaPorNome(nome);
		if(m != null)
			throw new Exception("Música " + nome + " já existente");
		m = new Musica(nome, a, duracao);
		if(m.getDuracao() <= 10)
			throw new Exception("Não existe música com essa duração");
		a.adicionar(m);
		daomusica.create(m);
		DAO.commit();
		return m;
	}
	
	public static Artista cadastrarArtista(String nome, String nacionalidade) throws Exception{
		DAO.begin();
		Artista a = daoartista.buscaPorNome(nome);
		if(a != null)
			throw new Exception("Artista " + nome + " já cadastrado");
		a = new Artista(nome, nacionalidade);
		daoartista.create(a);
		DAO.commit();
		return a;
	}
	
	// Remoções
	
	public static Artista removerArtista(String nome) throws Exception{
		DAO.begin();
		Artista a = daoartista.buscaPorNome(nome);
		if(a == null)
			throw new Exception("Artista " + nome + " não localizado");
		daoartista.delete(a);
		DAO.commit();
		return a;
	}
	
	public static Album removerAlbum(String nome) throws Exception{
		DAO.begin();
		Album a = daoalbum.listarPorNome(nome);
		if(a == null)
			throw new Exception("Album inexistente");
		if(a.getArtista() != null) {
			Artista ar = a.getArtista();
			ar.remover(a);
			daoartista.update(ar);
		}
		daoalbum.delete(a);
		DAO.commit();
		return a;
	}
	
	public static Musica removerMusica(String nome) throws Exception{
		DAO.begin();
		Musica m = daomusica.buscaPorNome(nome);
		if(m == null)
			throw new Exception("Música inexistente");
		if(m.getAlbum() != null) {
			Album a = m.getAlbum();
			a.remover(m);
			daoalbum.update(a);
		}
		daomusica.delete(m);
		DAO.commit();
		return m;
	}
	
	//Atualizações
	
	public static void atualizarAlbum(String nome, String novo) throws Exception{
		DAO.begin();
		Album a = daoalbum.listarPorNome(nome);
		if(a == null)
			throw new Exception("Album não cadastrado");
		a.setNome(novo);
		a = daoalbum.update(a);
		DAO.commit();
	}
	
	public static void atualizarArtista(String nome, String novo) throws Exception{
		DAO.begin();
		Artista a = daoartista.buscaPorNome(nome);
		if(a == null)
			throw new Exception("Artista não cadastrado");
		a.setNome(novo);
		a = daoartista.update(a);
		DAO.commit();
	}
	
	public static void atualizarMusica(String nome, String novo) throws Exception{
		DAO.begin();
		Musica m = daomusica.buscaPorNome(nome);
		if(m == null)
			throw new Exception("Música não cadastrada");
		m.setNome(novo);
		m = daomusica.update(m);
		DAO.commit();
	}
	
	//Listagem
	
	public static String listarAlbuns() {
		List<Album> albuns = daoalbum.readAll();
		String texto = "--- Listagem de Álbuns --- \n";
		for(Album a: albuns)
			texto += a.getNome() + "\n";
		return texto;
	}
	
	public static String listarArtistas() {
		List<Artista> artistas = daoartista.readAll();
		String texto = "--- Listagem de Artistas --- \n";
		for(Artista a: artistas)
			texto += a.getNome() + "\n";
		return texto;
	}
	
	public static String listarMusicas() {
		List<Musica> musicas = daomusica.readAll();
		String texto = "--- Listagem de Músicas --- \n";
		for(Musica m: musicas)
			texto += m.getNome() + "\n";
		return texto;
	}
}
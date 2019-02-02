package modelo;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Artista artista;
	private String nome;
	@OneToMany(mappedBy="album", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private ArrayList<Musica> musicas = new ArrayList<Musica>();

	public Album(String nome, Artista a) {
		this.nome = nome;
		this.artista = a;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", artista=" + artista + ", nome=" + nome + ", musicas=" + musicas + "]";
	}
}



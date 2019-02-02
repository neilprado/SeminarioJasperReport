package modelo;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artista {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String nacionalidade;
	@OneToMany(mappedBy="artista",  cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private ArrayList<Album> albuns = new ArrayList<Album>();
	
	public Artista(String nome, String nac) {
		this.nome = nome;
		this.nacionalidade = nac;
	}
	
	public void adicionar(Album a) {
		albuns.add(a);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public ArrayList<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(ArrayList<Album> albuns) {
		this.albuns = albuns;
	}

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", albuns=" + albuns + "]";
	}
}

package modelo;

public class Cliente {
	private int id;
	private String nome;
	private String cidade;
	private String telefone;
	
	public Cliente(String nome, String cidade, String telefone) {
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
	}
	
	public Cliente() {}
	
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

package outroBanco;

public abstract class Pessoa  {
	
	private String nome, cidade;
	
	
	public Pessoa() {
		this.nome = "<digite o nome>";
		this.cidade = "<nome da cidade>";
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
	
}

package exercicios_24;

public class Livro {

	private String nome;
	private String autor;
	private String dataLancamento;
	private String tipo;
	
	public Livro(String nome, String autor, String dataLancamento, String tipo) {
		
		this.nome = nome;
		this.autor = autor;
		this.dataLancamento = dataLancamento;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void exibeDados(){
		
		System.out.println("Nome: "+nome);
		System.out.println("Autor: "+autor);
		System.out.println("Data do lançamento: "+dataLancamento);
		System.out.println("Tipo: "+tipo);
		
	}
	
}

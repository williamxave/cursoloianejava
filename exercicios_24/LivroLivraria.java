package exercicios_24;

public class LivroLivraria {

	private String nome;
	private String autor;
	private double valor;
	private String tipo;

	public LivroLivraria(String nome, String autor, double valor, String tipo) {

		this.nome = nome;
		this.autor = autor;
		this.valor = valor;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void exibeDados() {
		
		System.out.println("Nome: "+nome);
		System.out.println("Autor: "+autor);
		System.out.println("Valor: "+valor);
		System.out.println("Tipo: "+tipo);
	}
}

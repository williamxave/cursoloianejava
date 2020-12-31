package exercicios45;

public class ExceptionNome extends Exception {

	private String nome;

	public ExceptionNome(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "DIGITE UM NOME VALIDO";
	}

}

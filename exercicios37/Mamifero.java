package exercicios37;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero(String nome, double comprimento, int numeroDePatas, String cor, double velocidade) {
		super(nome, comprimento, numeroDePatas, cor, velocidade);
		this.alimento = "Mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAlimento: " + alimento + "\n";
	}

	
	
	
	

}

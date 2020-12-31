package exercicios37;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe(String nome, double comprimento, String cor, double velocidade) {
		super(nome, comprimento, cor, velocidade);
		this.caracteristica = "Barbatana e cauda";
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCaracteristica " + caracteristica + "\n";
	}

}

package exercicios37;

import java.util.ArrayList;

public abstract class Animal{

	private String nome;
	private double comprimento;
	private int numeroDePatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	ArrayList<Animal> animais = new ArrayList<Animal>();

	public Animal(String nome, double comprimento, int numeroDePatas, String cor, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDePatas = numeroDePatas;
		this.cor = cor;
		this.ambiente = "Terra";
		this.velocidade = velocidade;
	}

	public Animal(String nome, double comprimento, String cor, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.velocidade = velocidade;
		this.ambiente = "Mar";
		this.numeroDePatas = 0;
	}

	public Animal() {

	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Animal: " + nome + "\nComprimento: " + comprimento + " metros\nNumero De Patas: " + numeroDePatas
				+ "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + " m/s";
	}

}

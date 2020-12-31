package exercicios_24;

public class Lampada {

	private String nome;
	private String potencia;
	private String modelo;
	private String diametro;
	private String marca;
	private int tempoDeVida;
	private double preco;
	private int estoque;
	private int quantComprada;
	private double precoFinal;
	
	public Lampada(String nome, String potencia, String modelo, String diametro, String marca, int tempoDeVida, double preco, int estoque) {
		
		this.nome = nome;
		this.potencia = potencia;
		this.modelo = modelo;
		this.diametro = diametro;
		this.marca = marca;
		this.tempoDeVida = tempoDeVida;
		this.preco = preco;
		this.estoque = estoque;
		addLampada();
		quantComprada = 0;
		
	
	}
	
	//GETERS
	
	public String getNome() {
		
		return nome;
	}
	
	public String getPotencia() {
		
		return potencia;
	}
	
	public String getModelo() {
		
		return modelo;
	}
	
	public String getDiamentro() {
		
		return diametro;
	}
	
	public String getMarca() {
		
		return marca;
	}
	
	public int getTempoDeVida() {
		
		return tempoDeVida;
	}
	
	public double getPreco() {
		
		return preco;
	}
	
	public int getQuantComprada() {
		
		return quantComprada;
	}
	
	
	//SETTERS
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public void setPotencia(String potencia) {
		
		this.potencia = potencia;
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	
	public void setDiamentro(String diametro) {
		
		this.diametro = diametro;
	}
	
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public void setTempoDeVida(int tempoDeVida) {
		
		this.tempoDeVida = tempoDeVida;
	}
	
	public void setPreco(double preco) {
		
		this.preco = preco;
	}
	
	public void setQuantComprada(int quantComprada) {
		
		this.quantComprada = quantComprada;
}
	
	// Metodos extras
	
	public String comprou() {
		quantComprada++;
		 return "Voce comprou "+quantComprada;
	}
	
	public double precoFinal() {
		
		precoFinal = (preco * quantComprada);
		
		return precoFinal;
	}
	
	public void setEstoque() {
		
		estoque--;
	}
	
	public int getEstoque() {
		
		return estoque;
	}
	
	public void addLampada() {
		estoque++;
		System.out.println("Uma lampada foi adicionada ao estoque!");
	}

	public void exibeDados() {
		
		System.out.println("Tipo: " +nome);
		System.out.println("Potencia: " +potencia);
		System.out.println("Modelo: " +modelo);
		System.out.println("Diametro: " +diametro);
		System.out.println("Marca: " +marca);
		System.out.println("Tempo de vida: " +tempoDeVida+ "Horas");
		System.out.println("Preço: " +preco+ "R$");
		
	}
	
}

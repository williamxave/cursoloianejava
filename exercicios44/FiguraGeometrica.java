package exercicios44;

import java.util.ArrayList;

public abstract class FiguraGeometrica {

	private String nome;
	private String cor;
	private String tipo;
	ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
	

	
	public ArrayList<FiguraGeometrica> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<FiguraGeometrica> figuras) {
		this.figuras = figuras;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "\nTipo: " + tipo + "\nNome: " + nome + "\nCor:" + cor;
	}

	
}

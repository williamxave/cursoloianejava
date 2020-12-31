package exercicios37;

import java.util.ArrayList;

public abstract class ReceitaFederal {

	private String nome;

	ArrayList<ReceitaFederal> pessoas = new ArrayList<ReceitaFederal>();

	public ReceitaFederal(String nome) {

		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<ReceitaFederal> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<ReceitaFederal> pessoas) {
		this.pessoas = pessoas;
	}

	@Override
	public String toString() {
		return "ReceitaFederal \nNome: " + nome + ",pessoas=" + pessoas + "]";
	}

}

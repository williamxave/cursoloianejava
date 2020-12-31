package exercicios36;

import java.util.Arrays;

public class Agenda {

	private String nome;
	private Contato[] contato;

	public Agenda() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContato() {
		return contato;
	}

	public void setContato(Contato[] contato) {
		this.contato = contato;
		
	}

	@Override
	public String toString() {
		return "\nAgenda \nNome: " + nome + " " + Arrays.toString(contato);
	}

	
}

package exercicios45;

import exercicios36.Contato;

public class Agenda {

	private String nomeAgenda;
	private Contato contato;
	private Contato[] cont = new Contato[5];

	public Agenda() {

	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Contato[] getCont() {
		return cont;
	}

	public void setCont(Contato[] cont) {
		this.cont = cont;
	}

	@Override
	public String toString() {
		return "\nNome da agenda: " + getNomeAgenda();
	}

}

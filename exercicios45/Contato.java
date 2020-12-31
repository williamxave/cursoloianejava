package exercicios45;

public class Contato extends Agenda {

	private String nome;
	private String telefone;
	private int id;

	public Contato() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNome: " + nome + "\nTelefone: " + telefone + "\nID: " + id;
	}

}

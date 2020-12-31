package exercicios36;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private String matricula;
	private ArrayList<Double> notas = new ArrayList<Double>();
	private ArrayList<Double> notasTurma = new ArrayList<Double>();
	private double media = 0;
	private double mediaTurma = 0;

	public void calculaNotaTurma() {
		for (int i = 0; i < notasTurma.size(); i++) {
			mediaTurma += notasTurma.get(i);
		}
		mediaTurma = mediaTurma / notasTurma.size();
	}

	public boolean mostraNotaTurma() {
		if (mediaTurma >= 7) {
			return true;
		}
		return false;
	}

	public void calculaMedia() {
		for (int i = 0; i < notas.size(); i++) {
			media += notas.get(i);
		}
		media = media / notas.size();
	}

	public boolean recebeMedia() {
		if (media >= 7) {
			return true;
		}
		return false;
	}

	public ArrayList<Double> getNotasTurma() {
		return notasTurma;
	}

	public void setNotasTurma(ArrayList<Double> notasTurma) {
		this.notasTurma = notasTurma;
	}

	public double getMediaTurma() {
		return mediaTurma;
	}

	public void setMediaTurma(double mediaTurma) {
		this.mediaTurma = mediaTurma;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nMatricula: " + matricula + "\nNotas:" + notas + "\nMedia: " + recebeMedia()
				+ "\nMedia da turma: " + mostraNotaTurma() + "\n";
	}

}

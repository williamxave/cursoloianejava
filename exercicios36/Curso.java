package exercicios36;

import java.util.ArrayList;

public class Curso {

	private String nome;
	private double horario;
	private Professor professor;
	private ArrayList<Aluno> alun = new ArrayList<Aluno>();
	
	

	public Curso() {
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Aluno> getAlun() {
		return alun;
	}

	public void setAlun(ArrayList<Aluno> alun) {
		this.alun = alun;
	}

	@Override
	public String toString() {
		return "Curso\n=====\nNome: " + nome + "\nHorario: " + horario +"\n========= \nProfessor:\n=========" + professor +"\n======\nAlunos:\n======" + alun;
	}

}

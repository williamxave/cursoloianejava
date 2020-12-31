package cursojava.estudo.heranca;

public class Aluno extends Pessoa {

	private String cursos[];
	private double notas[];

	public Aluno() {
		super();
		
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String obterEtiqueta() {

		String s = "Enderço do Aluno: ";
		
		s += this.getEndereco();
		
		return s;
	}
}

package exercicios36;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean sair = false, sairAluno = false;
		Professor professor = new Professor();
		Curso curso = new Curso();
		int contAluno = 0, cont = 0, contador = 0;
		double resp = 0, mediaTurma = 0;
		String respostaSaida;
		ArrayList<Aluno> alun = new ArrayList<Aluno>();
		ArrayList<Double> notasTurma = new ArrayList<Double>();
		ArrayList<Double> notas;
		do {
			
			System.out.println("Digite o nome do curso: ");
			curso.setNome(scan.nextLine());
			System.out.println("Digite a hora do curso: ");
			curso.setHorario(scan.nextDouble());

			System.out.println("============================");
			System.out.println("Faça o cadastro do professor");
			System.out.println("============================");
			System.out.println("Digite o nome do professor: ");
			professor.setNome(scan.next());
			System.out.println("Digite o email do professor: ");
			professor.setEmail(scan.next());
			System.out.println("Digite o departamento professor: ");
			professor.setDepartamento(scan.next());
			curso.setProfessor(professor);
			do {
				for (int i = 0; i < 2; i++) {
					Aluno aluno = new Aluno();
					System.out.println("============================");
					System.out.println("Faça o cadastro dos alunos");
					System.out.println("============================");
					System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
					aluno.setNome(scan.next());
					System.out.println("Digite o numero da matricula do aluno " + aluno.getNome());
					aluno.setMatricula(scan.next());
					curso.setAlun(alun);
					alun.add(aluno);
					contAluno++;
					notas = new ArrayList<Double>();
					for (int j = 0; j < 4; j++) {
						System.out.println("Digite a " + (j + 1) + "º nota do aluno: " + aluno.getNome());
						resp = scan.nextDouble();
						notas.add(resp);
						aluno.setNotas(notas);
						aluno.setNotasTurma(notasTurma);
						notasTurma.add(resp);
					}
					aluno.calculaNotaTurma();
					aluno.mostraNotaTurma();
					aluno.calculaMedia();
					if (contAluno == 2) {
						sairAluno = true;
					}
				}
			} while (!sairAluno);
			System.out.println("==============================================");
			System.out.println("Gostaria de cadastrar mais cursos: S/SIM N/NAO");
			System.out.println("==============================================");
			respostaSaida = scan.next();
			if (respostaSaida.equalsIgnoreCase("n")) {
				sair = true;
			}
		} while (!sair);
		System.out.println(curso.toString().replace("[", "").replace("]", "").replace(",", "|"));
	}
}

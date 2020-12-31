package exercicios_25_27;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		String[][] vet1 = new String[3][2];
		Scanner scan = new Scanner(System.in);
		String nome = null, curso = null, resp;
		int idade = 0;
		String nota;
		boolean sair;
		int cont = 1;
		int reprovado = 0;

		do {
			Aluno aluno = new Aluno(nome, idade, curso);
			System.out.println("Digite o nome do aluno: ");
			aluno.setNome(nome = scan.nextLine());
			System.out.println("Digite a idade do aluno: ");
			aluno.setIdade(idade = scan.nextInt());
			System.out.println("Digite o curso do aluno: ");
			scan.next();
			aluno.setCurso(curso = scan.nextLine());
			System.out.println("Deseja cadastrar mais alunos?  SIM / NAO");
			resp = scan.nextLine();

		} while (resp.equalsIgnoreCase("SIM"));

		for (int i = 0; i < vet1.length; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println("Digite a " + (i + 1) + "º materia");
				vet1[i][j] = scan.nextLine();
				for (int w = 1; w < 2; w++) {
					System.out.println("Digite a nota da " + (i + 1) + "º materia");
					nota = scan.nextLine();
					vet1[i][w] = nota;

					double valorDouble = Double.parseDouble(nota);

					if (valorDouble >= 7) {
						System.out.println(" |APROVADO|");

					} else {
						System.out.println(" |REPROVADO|");
						reprovado++;
					}

				}
			}
		}

		for (int i = 0; i < vet1.length; i++) {
			System.out.print("\n|");
			for (int j = 0; j < vet1[i].length; j++) {
				System.out.print(vet1[i][j] + "|");
			}
		}
		if(reprovado >= 1) {
			System.out.println("\nREPROVADO");
		}else {
			System.out.println("\nAPROVADO");
		}
	}

}

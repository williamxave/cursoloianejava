package cursojava.aula.matriz;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {

		String[][][] agenda = new String[12][30][8];
		Scanner scan = new Scanner(System.in);
		String resposta, compromisso;
		boolean confirma = true;
		boolean sair = true;
		char confirm;
		int dia;
		int mes;
		int hora;
		String out = "";

		do {
			mes = 0;
			dia = 0;
			hora = 0;
			System.out.println("Gostaria de agenda algum compromisso na sua agenda online ? S/SIM ou N/NAO");

			resposta = scan.next();

			if (resposta.equalsIgnoreCase("nao")) {
				sair = true;
				System.out.println("Saindo ...");

			} else {

				do {

					System.out.println("Digite o mes do compromisso: ");
					mes = scan.nextInt() - 1;
					System.out.println("Digite o dia do compromisso: ");
					dia = scan.nextInt() - 1;
					System.out.println("Digite a hora do compromisso: ");
					hora = scan.nextInt() - 1;

					System.out.println("Digite o compromisso: ");
					agenda[mes][dia][hora] = scan.nextLine();
					agenda[mes][dia][hora] += scan.nextLine();
					System.out.println("Compromisso cadastrado com sucesso");
					System.out.println("Deseja cadastrar outro ? ");
					confirm = scan.next().charAt(0);

					if (confirm == 'n') {

						confirma = false;
						out = "Você tem um compromisso no mes " + (mes + 1) + " dia " + (dia + 1) + " e na hora "
								+ (hora + 1);
					}

				} while (confirma == true);
			}

		} while (sair == false);

		System.out.println(out);

		System.out.println("Gostaria de ver seus compromissos? ");
		compromisso = scan.next();

		if (compromisso.equalsIgnoreCase("sim")) {
			System.out.println("Digite o mes do compromisso: ");
			mes = scan.nextInt() - 1;
			System.out.println("Digite o dia do compromisso: ");
			dia = scan.nextInt() - 1;

			for (int i = 0; i < 8; i++) {

				System.out.println(agenda[mes][dia][i]);
			}
		} else {

			System.out.println("OBRIGADO POR SUA DADINHA");
		}
	}

}

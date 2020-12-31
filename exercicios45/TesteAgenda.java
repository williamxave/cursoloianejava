package exercicios45;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) throws Exception {
		char resp;
		String nome = "";
		boolean sair = false;
		boolean sair2 = false;
		int resp3 = 0;
		int conta = 0;

		Scanner scan = new Scanner(System.in);
		Contato contato = null;
		Contato[] cont = new Contato[5];

		System.out.println("BEM VINDO A MINHA AGENDINHA");
		System.out.println("=========================================");
		System.out.println("Gostaria de criar uma agenda? S/SIM N/NAO");
		System.out.println("=========================================");
		resp = scan.next().charAt(0);
		if (resp == 'S' || resp == 's') {

			do {

				Agenda agenda = new Agenda();
				System.out.println("Digite o nome da agenda");
				try {
					nome = scan.next();
					agenda.setNomeAgenda(nome);

					if (Character.isDigit(nome.charAt(0)) == true) {
						throw new ExceptionNome(nome);
					}
				} catch (ExceptionNome e) {

					System.out.println("==== DIGITE UM NOME VALIDO ====");
					System.out.println("SUA AGENDA NAO PODE COMEÇAR COM NUMERO");
					sair = false;
					break;
				}

				do {

					System.out.println("=======================");
					System.out.println("         MENU     ");
					System.out
							.println(" 1-> Cadastrar contado\n 2-> Verificar Contato\n 3-> Mostrar agenda\n 4-> Sair");
					System.out.println("=======================");
					resp3 = scan.nextInt();
					switch (resp3) {

					case 1:

						contato = new Contato();
						System.out.println("CADASTRE OS CONTATOS");
						System.out.println("Digite o nome: ");
						nome = scan.next();
						contato.setNome(nome);
						System.out.println("Digite o telefone: ");
						contato.setTelefone(scan.next());
						conta++;
						contato.setId(conta);
						for (int i = 0; i < 3; i++) {
							if (cont[i] == null) {
								cont[i] = contato;
								break;
							}

						}

						System.out.println("Gostaria de cadastrar mais contatos? ");
						resp = scan.next().charAt(0);
						if (resp == 'N' || resp == 'n') {
							sair2 = true;
						}

						break;

					case 2:

						System.out.println("Digite o nome do contato");
						nome = scan.next();
						try {
							for (Contato c : cont) {
								if (nome.equals(c.getNome())) {
									System.out.println(c.toString());
									break;
								}
							}
						} catch (Exception e) {

							System.out.println("O NOME DIGITADO NÃO ESTÁ CADASTRADO NA AGENDA");

						}

						System.out.println("Gostaria de procurar outro contato? S/SIM N/NAO");
						resp = scan.next().charAt(0);
						if (resp == 'N' || resp == 'n') {
							sair2 = true;
						}
						break;

					case 3:

						for (int i = 0; i < cont.length; i++) {
							System.out.println(cont[i]);
						}
						sair2 = false;
						break;

					case 4:
						sair2 = true;
						sair = true;
						break;
					default:
						System.out.println("DIGITE UMA OPÇÃO VALIDA");
						break;
					}

				} while (!sair2);

			} while (!sair);

		} else {
			sair = true;
		}

	}

}

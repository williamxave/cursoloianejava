package exercicios36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato[] contato = new Contato[3];
		Endereco endereco;
		Contato c;
		boolean sair = false;
		String resposta;
		int j = 0;
		System.out.println("Digite o nome da agenda: ");
		agenda.setNome(scan.nextLine());

		do {
			System.out.println("Gostaria de criar um contato para a agenda? " + agenda.getNome());
			resposta = scan.nextLine();
			if (resposta.equalsIgnoreCase("s") && j == 3) {
				System.out.println("VOCÊ SO PODE CRIAR 3 CONTATOS");
				sair = true;
				break;
			}
			if (resposta.equalsIgnoreCase("S")) {

				for (int i = 0; i < 1; i++) {
					c = new Contato();
					System.out.println("Digite o nome do contato: ");
					c.setNome(scan.nextLine());
					System.out.println("Digite o numero de celular ou fixo: ");
					c.setNumero(scan.nextLine());
					System.out.println("Digite o email: ");
					c.setEmail(scan.nextLine());
					
					endereco = new Endereco();
					System.out.println("Digite o endereco do contado: " + c.getNome());
					System.out.println("Digite a rua: ");
					endereco.setRua(scan.nextLine());
					System.out.println("Digite o bairro: ");
					endereco.setBairro(scan.nextLine());
					System.out.println("Digite o estado: ");
					endereco.setEstado(scan.nextLine());
					System.out.println("Digite o cep: ");
					endereco.setCep(scan.nextLine());
					System.out.println("Digite o complemento: ");
					endereco.setComplemento(scan.nextLine());
					System.out.println("Digite o numero do complemento: ");
					endereco.setNumero(scan.nextLine());
					
					c.setEndereco(endereco);
					contato[j] = c;
				}
				j++;
			} else if (resposta.equalsIgnoreCase("N")) {
				sair = true;
			} else {
				System.out.println("=========================================");
				System.out.println("Digite uma resposta valida S/SIM ou N/NAO");
				System.out.println("=========================================");
				sair = false;
			}

		} while (!sair);

		agenda.setContato(contato);
		System.out.println(agenda.toString().replace("[", "").replace("]", "").replace(",", "\n"));

		// System.out.println(agenda.getNome());
	}
}

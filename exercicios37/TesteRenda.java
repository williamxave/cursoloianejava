package exercicios37;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteRenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char resp;
		double saldo = 0;
		String nome = "";
		int resp1 = 0;
		boolean sair = false;
		PessoaJuridica pessoaJuridica;
		PessoaFisica pessoaFisica;
		ArrayList<ReceitaFederal> pessoas = new ArrayList<ReceitaFederal>();

		System.out.println("Gostaria de cadastrar alguem?");
		resp = scan.next().charAt(0);

		if (resp == 'S' || resp == 's') {

			do {
				System.out.println("Gostaria de cadastrar uma pessoa fisica ou juridica?");
				System.out.println("1-> Pessoa Física\n2-> Pessoa Júridica\n3-> SAIR");
				resp1 = scan.nextInt();
				switch (resp1) {

				case 1:
					pessoaFisica = new PessoaFisica(nome, saldo);
					System.out.println("Digite o nome:");
					nome = scan.next();
					pessoaFisica.setNome(nome);
					System.out.println("Digite o saldo: ");
					saldo = scan.nextDouble();
					pessoas.add(pessoaFisica);
					pessoaFisica.setSaldo(saldo);
					pessoaFisica.calculaRenda();
					pessoaFisica.setPessoas(pessoas);
					System.out.println("=================================================");
					System.out.println("Deseja cadastrar mais pessoas  S/SIM N/NÃO");
					System.out.println("=================================================");
					resp = scan.next().charAt(0);
					if (resp == 'n' || resp == 'n') {
						sair = true;
					} else {
						sair = false;
					}
					break;

				case 2:
					pessoaJuridica = new PessoaJuridica(nome, saldo);
					System.out.println("Digite o nome:");
					nome = scan.next();
					pessoaJuridica.setNome(nome);
					System.out.println("Digite o saldo: ");
					saldo = scan.nextDouble();
					pessoas.add(pessoaJuridica);
					pessoaJuridica.setSaldo(saldo);
					pessoaJuridica.calculaRenda();
					pessoaJuridica.setPessoas(pessoas);
					System.out.println("=================================================");
					System.out.println("Deseja cadastrar mais pessoas  S/SIM N/NÃO");
					System.out.println("=================================================");
					resp = scan.next().charAt(0);
					if (resp == 'n' || resp == 'n') {
						sair = true;
					} else {
						sair = false;
					}
					break;

				case 3:
					sair = true;
					break;

				default:
					System.out.println("OPCAO INVALIDA");
					sair = false;
					break;
				}
			} while (!sair);
		} else {
			System.out.println("Obrigada por usar nosso software");
		}

		for (int i = 0; i < pessoas.size(); i++) {

			System.out.println(pessoas.get(i));
		}
		
	}
}

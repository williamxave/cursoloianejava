package exercicios37;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteContaBancaria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

		ContaPoupanca poupanca = new ContaPoupanca("William", "87457475", 500.00, 19);
		poupanca.setContas(contas);
		contas.add(poupanca);

		ContaEspecial especial = new ContaEspecial("Evair", "4343434", 500.00);
		poupanca.setContas(contas);
		contas.add(especial);

		poupanca.sacar(5);
		poupanca.depositar(10000.00);
		System.out.println(poupanca.getSaldo());
		System.out.println(poupanca.verificaRendimento(1));
		poupanca.addRendimento();
		System.out.println(poupanca.getSaldo());
		System.out.println(especial.getLimite());
		especial.sacar(10);
		System.out.println(especial.getSaldo());

		System.out.println(" ============================= ");

		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i) + " ");
		}
	}
}

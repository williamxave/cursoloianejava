package exercicios_25_27;

import java.util.Scanner;

public class TesteJogoVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogo = new JogoDaVelha();
		String jogador1, jogador2;
		boolean full = false;
		int linha, coluna;
		int k = 0;
		int vezes = 9;

		while (k <= 1) {
			System.out.println("Digite o nome do " + (k + 1) + "º jogador(a)");
			jogador1 = scan.nextLine();
			jogo.addJogadores(jogador1);
			k++;
		}

		jogo.verJogadores();
		System.out.println(" ");
		jogo.mostraTabela();
		System.out.println(" ");

		do {

			jogo.avisaJogadorVez();
			System.out.println(" ");
			System.out.print("Digite a linha: ");
			linha = scan.nextInt() - 1;
			System.out.print("Digite a coluna: ");
			coluna = scan.nextInt() - 1;
			jogo.marcarPosicao(linha, coluna);
			jogo.verificaVez();
			jogo.verificaGanhador();

		} while (!jogo.sairLoop());
	}
}

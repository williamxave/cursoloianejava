package cursojava.aula.matriz;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] jogoVelha = new String[3][3];
		String[] jogador = new String[2];

		int linha, coluna;
		boolean win = false;
		String nomeJogador, nomeJogador2, jogadorDaVez;
		boolean jogada = false;
		boolean verifica = false;
		boolean validaJogada = false;
		int jogada1 = 1;
		int jogada2 = 0;
		int jogadas = 0;

		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				jogoVelha[i][j] = "-";
			}
		}
		do {
			for (int i = 0; i < jogador.length; i++) {
				System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
				jogador[i] = scan.nextLine();
			}
			do {
				System.out.println("=========================");
				System.out.println("Situação atual da tabela!");
				System.out.print("=========================");
				for (int i = 0; i < jogoVelha.length; i++) {
					System.out.print("\n|");
					for (int j = 0; j < jogoVelha[i].length; j++) {
						System.out.print(jogoVelha[i][j] + "|");
					}
				}
				if (jogada1 == 1) {
					jogadorDaVez = jogador[0];
				} else {
					jogadorDaVez = jogador[1];
				}
				if (jogada1 == 1 || jogada2 == 1) {
					System.out.println("\n===================");
					System.out.println("Vez do jogador [" + jogadorDaVez + "]");
					System.out.println("===================");
					if (jogada1 == 1) {
						System.out.println("Você tem o X");
					} else {
						System.out.println("Você tem o O");
					}
					System.out.println("Digite a linha: ");
					linha = scan.nextInt() - 1;
					System.out.println("Digite a coluna: ");
					coluna = scan.nextInt() - 1;
					if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
						if (jogoVelha[linha][coluna] == "X" || jogoVelha[linha][coluna] == "O") {
							System.out.println("=========================");
							System.out.println("POSICAO OCUPADA USE OUTRA");
							jogada = false;
							if (jogada1 == 1) {
								jogada2 = 0;
							} else {
								jogada1 = 0;
							}
						} else {
							jogadas++;
							validaJogada = true;
							jogada = true;
							if (jogada == true && jogada1 == 1) {
								jogoVelha[linha][coluna] = "X";
							} else if (jogada == true && jogada2 == 1) {
								jogoVelha[linha][coluna] = "O";
							} else {
								System.out.println("BUGAO");
							}
							if (jogada1 == 1) {
								jogada1--;
								jogada2++;
							} else {
								jogada1++;
								jogada2--;
							}
						}
					} else {
						System.out.println("Posicao INVALIDA");
						jogada = false;
						if (validaJogada) {
							if (jogada1 == 1) {
								jogada2 = 0;
							} else {
								jogada1 = 0;
							}
						}
					}
					if (jogoVelha[0][0] == "X" && jogoVelha[0][1] == "X" && jogoVelha[0][2] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[1][0] == "X" && jogoVelha[1][1] == "X" && jogoVelha[1][2] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[2][0] == "X" && jogoVelha[2][1] == "X" && jogoVelha[2][2] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][0] == "X" && jogoVelha[1][0] == "X" && jogoVelha[2][0] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][1] == "X" && jogoVelha[1][1] == "X" && jogoVelha[2][1] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][2] == "X" && jogoVelha[1][2] == "X" && jogoVelha[2][2] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][0] == "X" && jogoVelha[1][1] == "X" && jogoVelha[2][2] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][2] == "X" && jogoVelha[1][1] == "X" && jogoVelha[2][0] == "X") {
						System.out.println("O jogador [" + jogador[0] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][0] == "O" && jogoVelha[1][0] == "O" && jogoVelha[2][0] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][1] == "O" && jogoVelha[1][1] == "O" && jogoVelha[2][1] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][2] == "O" && jogoVelha[1][2] == "O" && jogoVelha[2][2] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][0] == "O" && jogoVelha[0][1] == "O" && jogoVelha[0][2] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][0] == "O" && jogoVelha[0][1] == "O" && jogoVelha[0][2] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[1][0] == "O" && jogoVelha[1][1] == "O" && jogoVelha[1][2] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[2][0] == "O" && jogoVelha[2][1] == "O" && jogoVelha[2][2] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][0] == "O" && jogoVelha[1][1] == "O" && jogoVelha[2][2] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else if (jogoVelha[0][2] == "O" && jogoVelha[1][1] == "O" && jogoVelha[2][0] == "O") {
						System.out.println("O jogador [" + jogador[1] + "] VENCEU!!");
						win = true;
						break;
					} else {
						if (jogadas == 9 && win == false) {
							System.out.println("EMPATOU");
							win = true;
							break;
						}
					}
				}
			} while (validaJogada);
		} while (win == false);
	}
}

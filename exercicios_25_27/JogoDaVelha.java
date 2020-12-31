package exercicios_25_27;

public class JogoDaVelha {

	private String[][] velha = new String[3][3];
	private String[] jogadores = new String[2];
	private String[][] sinal = new String[3][3];
	private String jogador;
	private int linha;
	private int coluna;
	private boolean verificaJogada;
	private boolean vezPlayer;
	private boolean jogador1;
	private boolean jogador2;
	private boolean autentificaJogada = false;
	private String jogadorOne;
	private String jogadorTwo;
	private int contadorEmpate = 0;
	private boolean win = false;

	public boolean sairLoop() {
		if(win  == true && sinal[linha][coluna] == "X") {
			System.out.println("\n O jogador [" + jogadores[0] + "] >> VENCEU <<");
		}else if(win == true && sinal[linha][coluna] == "O"){
			System.out.println("\n O jogador [" + jogadores[1] + "] >> VENCEU <<");
		}
		return win;
	}
	
	public void verificaGanhador() {

		if (velha[0][0].equals(sinal[0][0]) && velha[0][1].equals(sinal[0][1]) && velha[0][2].equals(sinal[0][2])) {
			win = true;
		} else if (velha[1][0].equals(sinal[1][0]) && velha[1][1].equals(sinal[1][1]) && velha[1][2].equals(sinal[1][2])) {
			win = true;
		} else if (velha[2][0].equals(sinal[2][0]) && velha[2][1].equals(sinal[2][1]) && velha[2][2].equals(sinal[2][2])) {
			win = true;
		} else if (velha[0][0].equals(sinal[0][0]) && velha[1][0].equals(sinal[1][0]) && velha[2][0].equals(sinal[2][0])) {
			win = true;
		} else if (velha[0][1].equals(sinal[0][1]) && velha[1][1].equals(sinal[1][1]) && velha[2][1].equals(sinal[2][1])) {
			win = true;
		} else if (velha[0][2].equals(sinal[0][2]) && velha[1][2].equals(sinal[1][2]) && velha[2][2].equals(sinal[2][2])) {
			win = true;
		} else if (velha[0][0].equals(sinal[0][0]) && velha[1][1].equals(sinal[1][1]) && velha[2][2].equals(sinal[2][2])) {
			win = true;
		} else if (velha[0][2].equals(sinal[0][2]) && velha[1][1].equals(sinal[1][1]) && velha[2][0].equals(sinal[2][0])) {
			win = true;
		} else if (contadorEmpate == 9 && win == false) {
			System.out.println("EMPATOU");
		} else {
			System.out.println(" ");
		}
	}

	public void verJogadores() {
		for (int i = 0; i < 1; i++) {
			System.out.println("=================");
			System.out.println(jogadores[0] + " Você tem o 'X'");
			System.out.println(jogadores[1] + " Você tem o 'O'");
			System.out.println("=================");
		}
	}

	public void addJogadores(String jogadorOne) {
		for (int i = 0; i < jogadores.length; i++) {
			if (jogadores[0] == null) {
				jogadores[0] = jogadorOne;
				jogador1 = true;
			} else {
				jogadores[1] = jogadorOne;
				jogador2 = true;
			}
		}
	}

	public void avisaJogadorVez() {
		if (jogador1 == true) {
			System.out.println("\n[" + jogadores[0] + "] Sua vez de jogar, você tem o 'X'");
		} else {
			System.out.println("\n[" + jogadores[1] + "] Sua vez de jogar, você tem o 'O'");
		}
	}

	public void verificaVez() {
		if (jogador1 == true && autentificaJogada == true) {
			jogador1 = false;
			jogador2 = true;
		} else if (jogador2 == true && autentificaJogada == true) {
			jogador1 = true;
			jogador2 = false;
		} else {
			System.out.println("ERRO");
		}
	}

	public void marcarPosicao(int linha, int coluna) {
		if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
			if (velha[linha][coluna] == "X" || velha[linha][coluna] == "O") {
				System.out.println("Posicao invalida");
				if (jogador1 == true) {
					jogador2 = false;
				} else {
					jogador1 = false;
				}
				autentificaJogada = false;
			} else {
				if (jogador1 == true) {
					velha[linha][coluna] = "X";
					sinal[linha][coluna] = "X";
				} else if (jogador2 == true) {
					velha[linha][coluna] = "O";
					sinal[linha][coluna] = "O";
				} else {
					System.out.println("ERRO");
				}
				autentificaJogada = true;
				contadorEmpate++;
			}
		} else {
			System.out.println("POSIÇÃO INVALIDA");
			if (jogador1 == true) {
				jogador1 = true;
				jogador2 = false;
			} else {
				jogador2 = true;
				jogador1 = false;
			}
			autentificaJogada = false;
		}
		for (int i = 0; i < velha.length; i++) {
			System.out.print("\n|");
			for (int j = 0; j < velha[i].length; j++) {
				System.out.print(velha[i][j] + "|");
			}
		}
	}

	public void mostraTabela() {
		System.out.println("Situação atual");
		for (int i = 0; i < velha.length; i++) {
			System.out.print("\n|");
			for (int j = 0; j < velha[i].length; j++) {
				velha[i][j] = "-";
				System.out.print(velha[i][j] + "|");
			}
		}
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {

		this.jogador = jogador;
	}

	public String[][] getJogo() {
		return velha;
	}

	public void setJogo(String[][] jogo) {
		this.velha = jogo;
	}

	public String[] getJogadores() {

		return jogadores;
	}

	public void setJogadores(String[] jogador) {

		this.jogadores = jogador;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public boolean isVerificaJogada() {
		return verificaJogada;
	}

	public void setVerificaJogada(boolean verificaJogada) {
		this.verificaJogada = verificaJogada;
	}

	public boolean isVezPlayer() {
		return vezPlayer;
	}

	public void setVezPlayer(boolean vezPlayer) {
		this.vezPlayer = vezPlayer;
	}

}

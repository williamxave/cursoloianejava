package exercicios_25_27;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String compra, resposta, resposta2, resp, resp2, resp3;
		boolean sair, ligada = false;

		Lampada lampada = new Lampada("Bacteriana", "30W", "Dos Pica", "50mm", "PCC", 8000, 9.85, 10);

		sair = false;

		System.out.println("===========================================================");
		System.out.println("Bem Vindo a loja de lampadas!!");
		System.out.println("===========================================================");
		System.out.println("Gostaria de adquirir algum dos nossos produtos S/SIM  N/NÃO");

		do {

			resposta = scan.nextLine();
			if (resposta.equalsIgnoreCase("S")) {

				System.out.println("Que Lampada gostaria de comprar: ");
				compra = scan.next();

				if (compra.equalsIgnoreCase("Flor") && lampada.getEstoque() > 1) {

					System.out.println("Compra efetuada com sucesso!!");
					lampada.setEstoque();
					System.out.println("========================================================");
					System.out.println("Ainda temos: " + lampada.getEstoque() + "Lampadas em estoque!");
					System.out.println("========================================================");
					System.out.println(lampada.comprou() + " lampadas. Total a pagar: " + lampada.precoFinal() + "R$");
					System.out.println("Gostaria de continuar as compras? ");

				} else {
					System.out.println("O item não está em estoque");
				}

			} else if (resposta.equalsIgnoreCase("n")) {
				System.out.println("Obrigado por vir e tenha um bom dia!");
				sair = true;
			}

		} while (sair == false);

		System.out.println("Deseja instalar a lamapada? S/SIM N/NAO");
		resp = scan.nextLine();

		do {
			System.out.println("Deseja ligar a lampada? ");
			resp2 = scan.nextLine();
			if (resp2.equalsIgnoreCase("S")) {
				lampada.ligaLampada();
				ligada = true;
			}
			if (ligada == true) {
				System.out.println("Voc deveria desligar a lampada: DESLIGAR? S/SIM N/NAO");
				resp3 = scan.nextLine();
				if (resp3.equalsIgnoreCase("S"))
					;
				lampada.ligaLampada();
			}

		} while (resp.equalsIgnoreCase("N") && resp.equalsIgnoreCase("S"));

	}

}

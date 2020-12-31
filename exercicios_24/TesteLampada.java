package exercicios_24;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String compra, resposta, resposta2;
		boolean sair;

		Lampada Flor = new Lampada("Bacteriana", "30W", "Dos Pica", "50mm", "PCC", 8000, 9.85,10);

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

				if (compra.equalsIgnoreCase("Flor") && Flor.getEstoque() > 1) {

					System.out.println("Compra efetuada com sucesso!!");
					Flor.setEstoque();
					System.out.println("========================================================");
					System.out.println("Ainda temos: " +Flor.getEstoque()+ "Lampadas em estoque!");
					System.out.println("========================================================");
					System.out.println( Flor.comprou()+ " lampadas. Total a pagar: " +Flor.precoFinal()+ "R$");
					System.out.println("Gostaria de continuar as compras? ");

				} else {
					System.out.println("O item não está em estoque");
				}

			} else if (resposta.equalsIgnoreCase("n")) {
				System.out.println("Obrigado por vir e tenha um bom dia!");
				sair = true;
			}

		} while (sair == false);

	}

}

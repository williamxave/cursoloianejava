package exercicios_34;

import java.util.Scanner;

public class TesteConversaoDeUnidadeDeVolume {

	public static void main(String[] args) {
		int resposta = 0;
		double rep1 = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("BEM VINDO");
		System.out.println(
				"\n1 -> Litros em centimetros cubicos \n2 -> Metros cubicos em litros \n3 -> Metros cubicos em pés cubicos \n4 -> Galao Americano em polegadas cubicas \n5 -> Galao Americano em litros"
						+ "\n0 -> SAIR");
		System.out.print("Digite oque gostaria de converter: ");
		resposta = scan.nextInt();
		switch (resposta) {

		case 1:
			System.out.println("Digite a quantidade de litros que deseja converter: ");
			rep1 = scan.nextDouble();
			ConversaoDeUnidadeDeVolume.calculaLitro(rep1);
			System.out.println(
					"O resultado da conversao é: " + ConversaoDeUnidadeDeVolume.mostraLitro() + " centimetros cubicos");
			break;

		case 2:
			System.out.println("Digite a quantidade de metros cubicos que deseja converter: ");
			rep1 = scan.nextDouble();
			ConversaoDeUnidadeDeVolume.calculaMetroCubico(rep1);
			System.out.println(
					"O resultado da conversao é: " + ConversaoDeUnidadeDeVolume.mostraMetroCubico() + " litros");
			break;

		case 3:
			System.out.println("Digite a quantidade de metros cubicos que deseja converter: ");
			rep1 = scan.nextDouble();
			ConversaoDeUnidadeDeVolume.dedos(rep1);
			System.out.println(
					"O resultado da conversao é: " + ConversaoDeUnidadeDeVolume.mostraDedos() + " pés cubicos");
			break;

		case 4:
			System.out.println("Digite a quantidade de galao americano que deseja converter: ");
			rep1 = scan.nextDouble();
			ConversaoDeUnidadeDeVolume.calculaGalao(rep1);
			System.out.println(
					"O resultado da conversao é: " + ConversaoDeUnidadeDeVolume.mostraGalao() + " polegadas cubicas");
			break;

		case 5:
			System.out.println("Digite a quantidade de galao americano que deseja converter: ");
			rep1 = scan.nextDouble();
			ConversaoDeUnidadeDeVolume.calculaLazao(rep1);
			;
			System.out.println("O resultado da conversao é: " + ConversaoDeUnidadeDeVolume.mostraLazao() + " litros");
			break;

		case 6:
			System.out.println("OBRIGADO PELA PREFERENCIA");
			break;

		default:
			
			break;

		}
	}

}

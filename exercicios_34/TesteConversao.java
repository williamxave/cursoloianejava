package exercicios_34;

import java.util.Scanner;

public class TesteConversao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de p�s quadradados que deseja converter em centrimetros quadrados: ");
		ConversaoDeUnidadeDeArea.verPes(scan.nextDouble());
		System.out.println("O valor de p�s equivale a: "+ ConversaoDeUnidadeDeArea.mostraPe());
		System.out.println(" ");
		System.out.println("Digite o valor em metros quadrados que voc deseja converter em p�s quadrados: ");
		ConversaoDeUnidadeDeArea.calculaMetro(scan.nextDouble());
		System.out.println("O valor da conversao �: " +ConversaoDeUnidadeDeArea.mostraMetro());
		System.out.println(" ");
		System.out.println("Digite o valor em milhas que voc quer converter em acres: ");
		ConversaoDeUnidadeDeArea.calculaMilha(scan.nextDouble());
		System.out.println("O valor da conversao �: " + ConversaoDeUnidadeDeArea.mostraMilha());
		System.out.println(" ");
		System.out.println("Digite o valor de acre que voc deseja converter em p�s quadrados: ");
		ConversaoDeUnidadeDeArea.calculaAcre(scan.nextDouble());
		System.out.println("O valor da conversao �: "+  ConversaoDeUnidadeDeArea.mostraAcre());
		

	}

}

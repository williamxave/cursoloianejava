package exercicios_34;

import java.util.Scanner;

public class TesteConversaoDeUnidadeDeTempo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite os minutos que deseja converter: ");
		ConversaoDeUnidadeDeTempo.calculaMinuto(scan.nextDouble());
		System.out.println("O resultado da conversao é: " + ConversaoDeUnidadeDeTempo.retornaValores()+ " segundos");
		System.out.println(" ");
		System.out.println("Digite as horas que deseja converter: ");
		ConversaoDeUnidadeDeTempo.calculaHora(scan.nextDouble());
		System.out.println("O resultado da conversao é: " + ConversaoDeUnidadeDeTempo.retornaValores()+ " minutos");
		System.out.println(" ");
		System.out.println("Digite os dias que deseja converter: ");
		ConversaoDeUnidadeDeTempo.calculaDia(scan.nextDouble());
		System.out.println("O resultado da conversao é: "+ ConversaoDeUnidadeDeTempo.retornaValores()+ " horas");
		System.out.println(" ");
		System.out.println("Digite as semanas que deseja converter: ");
		ConversaoDeUnidadeDeTempo.calculaSemana(scan.nextDouble());
		System.out.println("O resultado da conversao é: "+ ConversaoDeUnidadeDeTempo.retornaValores()+ " dias");
		System.out.println(" ");
		System.out.println("Digite os mes que deseja converter: ");
		ConversaoDeUnidadeDeTempo.calculaMes(scan.nextDouble());
		System.out.println("O resultado da conversao é: "+ ConversaoDeUnidadeDeTempo.retornaValores()+ " dias");
		System.out.println(" ");
		System.out.println("Digite os anos que deseja converter: ");
		ConversaoDeUnidadeDeTempo.calculaAno(scan.nextDouble());
		System.out.println("O resultado da conversao é: "+ ConversaoDeUnidadeDeTempo.retornaValores()+ " dias");
		System.out.println(" ");
	}

}

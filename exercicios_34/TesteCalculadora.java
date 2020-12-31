package exercicios_34;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		char resposta;
		int respostaCalcula, resposta2;
		double numerosCalcula, numerosCalcula2;
		do {

			System.out.println("== WELCOMIDO A MINHA CALCULATRIX PIKA ==");
			System.out
					.println("1 -> Somar \n2 -> Subtrair \n3 -> Multiplicar \n4 -> Dividir \n5 -> Elevar \n6 -> Fatorial \n7 -> Sair");
			System.out.print("Escolha oque você gostaria de fazer: ");
			resposta2 = scan.nextInt();
			switch (resposta2) {

			case 1:
				System.out.print("Quantos numeros voc deseja somar?");
				respostaCalcula = scan.nextInt();
				for (int i = 0; i < respostaCalcula; i++) {
					System.out.print("Digite o " + (i + 1) + "º numero que deseja somar: ");
					numerosCalcula = scan.nextDouble();
					Calculadora.somar(numerosCalcula);
				}
				System.out.println("O resultado da soma é: " + Calculadora.getSoma());
				break;

			case 2:
				System.out.print("Digite o  1º numero que você quer subtrair: ");
				numerosCalcula = scan.nextDouble();
				System.out.print("Digite o  2º numero que você quer subtrair: ");
				numerosCalcula2 = scan.nextDouble();
				Calculadora.subtrair(numerosCalcula, numerosCalcula2);
				System.out.println("O resultado da subtração é: " + Calculadora.getSubtracao());
				break;

			case 3:
				System.out.print("Quantos numeros você deseja Multiplicar? ");
				respostaCalcula = scan.nextInt();
				for (int i = 0; i < respostaCalcula; i++) {
					System.out.print("Digite o " + (i + 1) + "º numero que deseja multiplicar: ");
					numerosCalcula = scan.nextDouble();
					Calculadora.multiplica(numerosCalcula);
				}
				System.out.println("O resultado da  subtração é: " + Calculadora.getMultiplica());
				break;

			case 4:

				System.out.print("Digite o  1º numero que você quer dividir: ");
				numerosCalcula = scan.nextDouble();
				System.out.print("Digite o  2º numero que você quer dividir: ");
				numerosCalcula2 = scan.nextDouble();
				Calculadora.dividir(numerosCalcula, numerosCalcula2);
				System.out.println("O resultado da divisão é: " + Calculadora.getDividir());
				break;

			case 5:

				System.out.print("Digite o numero que você quer elevar: ");
				numerosCalcula = scan.nextDouble();
				System.out.print("Digite o expoente: ");
				numerosCalcula2 = scan.nextDouble();
				Calculadora.elevar(numerosCalcula, numerosCalcula2);
				System.out.println("O resultado da divisão é: " + Calculadora.getElevar());
				break;

			case 6:
				System.out.println("Digite o valor para ver o fatorial: ");
				respostaCalcula = scan.nextInt();
				Calculadora.factorial(respostaCalcula);
				System.out.println("O fatorial de " +respostaCalcula+ " é: " +Calculadora.getFatorial());
				break;
				
			case 7:

				System.out.println("Deseja continuar: S/SIM N/NAO");
				resposta = scan.next().charAt(0);
				if (resposta == 'n' || resposta == 'N') {
					sair = true;
					System.out.println("OBRIGADO PELA VISITA");
				}
				sair = true;
				break;

			default:
				System.out.println("O numero digitado não é valido");
			}

		} while (!sair);
	}

}

package constanteenum;

public class Teste {

	public static void main(String[] args) {

		usandoConstantes();

		System.out.println(" ");

		usandoEnum();
	}

	private static void usandoConstantes() {

		int SEGUNDA = DiaSemanaConstante.SEGUNDA;
		int TERCA = DiaSemanaConstante.TERCA;
		int QUARTA = DiaSemanaConstante.QUARTA;
		int QUINTA = DiaSemanaConstante.QUINTA;
		int SEXTA = DiaSemanaConstante.SEXTA;
		int SABADO = DiaSemanaConstante.SABADO;
		int DOMINGO = DiaSemanaConstante.DOMINGO;

		System.out.println("Teste utilizando constantes no java");

		imprimeDiaSemana(SEGUNDA);
		imprimeDiaSemana(TERCA);
		imprimeDiaSemana(QUARTA);
		imprimeDiaSemana(QUINTA);
		imprimeDiaSemana(SEXTA);
		imprimeDiaSemana(SABADO);
		imprimeDiaSemana(DOMINGO);

	}

	private static void imprimeDiaSemana(int dia) {

		switch (dia) {

		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terca-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}

	private static void imprimeDiaSemana(DiaSemana dia) {

		switch (dia) {

		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terca-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}

	private static void usandoEnum() {

		DiaSemana SEGUNDA = DiaSemana.SEGUNDA;
		DiaSemana TERCA = DiaSemana.TERCA;
		DiaSemana QUARTA = DiaSemana.QUARTA;
		DiaSemana QUINTA = DiaSemana.QUINTA;
		DiaSemana SEXTA = DiaSemana.SEXTA;
		DiaSemana SABADO = DiaSemana.SABADO;
		DiaSemana DOMINGO = DiaSemana.DOMINGO;

		imprimeDiaSemana(SEGUNDA);
		imprimeDiaSemana(TERCA);
		imprimeDiaSemana(QUARTA);
		imprimeDiaSemana(QUINTA);
		imprimeDiaSemana(SEXTA);
		imprimeDiaSemana(SABADO);
		imprimeDiaSemana(DOMINGO);

	}

}

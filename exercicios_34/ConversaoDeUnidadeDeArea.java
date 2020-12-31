package exercicios_34;

public class ConversaoDeUnidadeDeArea {

	private static double metroQuadrado;
	private static double peQuadrado;
	private static double minhaQuadrada;
	private static double acre;
	private static double total;

	public ConversaoDeUnidadeDeArea() {

	}

	public static void verPes(double peQuadrado) {
		total = peQuadrado * 929;
	}

	public static void calculaMetro(double metroQuadrado) {
		total = metroQuadrado * 10.76;
	}

	public static void calculaMilha(double milhaQuadrada) {
		total = milhaQuadrada * 640;
	}

	public static void calculaAcre(double acre) {
		total = acre * 43.560;
	}
	// GETTERS

	public static double mostraPe() {
		return total;
	}

	public static double mostraMetro() {
		return total;
	}

	public static double mostraMilha() {
		return total;
	}

	public static double mostraAcre() {
		return total;
	}
}

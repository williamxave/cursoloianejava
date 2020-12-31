package exercicios_34;

public class ConversaoDeUnidadeDeVolume {

	private static double litro;
	private static double metroCubico;
	private static double galaoAmericano;
	private static double total;

	public ConversaoDeUnidadeDeVolume() {
		
		
	}

	public static void calculaLitro(double litro) {
		total =  litro * 1000;
	}
	
	public static void calculaMetroCubico(double metroCubico) {
		total = metroCubico * 1000;
	}
	
	public static void dedos(double pesCubicos) {
		total = pesCubicos * 35.32 ;
	}
	
	public static void calculaGalao(double galao) {
		total = galao * 231;
	}
	
	public static void calculaLazao(double galao) {
		total = galao * 3.785;
	}
	
	
	//Getters
	
	public static double mostraLitro() {
		return total;
	}
	
	public static double mostraMetroCubico() {
		return total;
	}
	
	public static double mostraDedos() {
		return total;
	}
	
	public static double mostraGalao() {
		return total;
	}

	public static double mostraLazao() {
		return total;
	}
	
		
	}

	
	



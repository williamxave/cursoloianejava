package exercicios_34;

public class ConversaoDeUnidadeDeTempo {

	private static double total;
	
	public ConversaoDeUnidadeDeTempo() {
		
	}
	
	public static void calculaMinuto(double minuto) {
		total =  minuto * 60;
	}
	public static void calculaHora(double hora) {
		total = hora * 60;
	}
	public static void calculaDia(double dia) {
		total = dia * 24;
	}
	public static void calculaSemana(double semana) {
		total = semana * 7;
	}
	public static void calculaMes(double mes) {
		total = mes * 30;
	}
	public static void calculaAno(double ano) {
		total = ano * 365.25;
	}
	
	public static double retornaValores() {
		return total;
	}
}

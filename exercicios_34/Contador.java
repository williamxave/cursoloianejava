package exercicios_34;

public class Contador {
	
	private static int contador = 0;
		
	public Contador() {
		contador();
	}
	public static void zeraContador() {
		contador = 0;
	}
	
	public static void contador() {
		contador ++;
		System.out.println("Contador iniciado");
	}
	public static void addContador() {
		contador++;
	}
	public static int mostraContador() {
		return contador;
		
	}
}

package exercicios35;

public class Soma {
	
	public Soma() {
		
	}
	
	public static int somar(int numero) {
		
		if(numero == 1) {
			return 1;
		}
		
		return numero + somar(numero - 1) ;
	}

}

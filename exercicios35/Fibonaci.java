package exercicios35;

public class Fibonaci {
	
	public Fibonaci() {
		
	}
	
	public static int calculaFibonaci(int num) {
		if(num < 2) {
			return 1;
		}
		 return calculaFibonaci(num -1) + calculaFibonaci(num -2);
	}

}

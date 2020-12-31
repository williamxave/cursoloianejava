package exercicios_34;

public class Calculadora {

	private static double subtracao = 0, total = 0, soma = 0, multiplica = 1, dividir = 0;
	private static  int fator = 1;
	
	public Calculadora() {

	}

	public static void factorial(int numero1) {
		for(int j = numero1 ; j >= 1;j--) {
		fator *= j;
			
		//	System.out.println(j + " * "+ fator+" = " +(fator *= j));
		}
		
	
	//	int i = numero1 -1;
	//	while (i>0){
	//		numero1 = numero1 * i;
	//		i--;
	//		System.out.println(i + " * " + numero1 + " = "+ i*numero1);
	//	}
		
		
	}

	public static void elevar(double numero1, double numero2) {
		total = Math.pow(numero1, numero2);
	}

	public static void dividir(double numero1, double numero2) {

		total = numero1 / numero2;
	}

	public static void multiplica(double numero1) {
		multiplica *= numero1;
	}

	public static void somar(double numero1) {
		soma += numero1;
	}

	public static void subtrair(double numero1, double numero2) {

		total = numero1 - numero2;
	}
	// GETTERS

	public static int getFatorial() {
		
		return fator;
	}
	
	public static double getElevar() {
		return total;
	}

	public static double getDividir() {
		return total;
	}

	public static double getMultiplica() {
		return multiplica;
	}

	public static double getSubtracao() {
		return total;
	}

	public static double getSoma() {
		return soma;
	}

}

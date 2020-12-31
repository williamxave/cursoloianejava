package exercicios46.enu;

public class TesteCalculadora {

	public static void main(String[] args) {

		for (Calculadora c : Calculadora.values()) {
			System.out.print(c.executarOperacao(5, 5) + " ");
			System.out.println(c.toString());
		}
	}
}

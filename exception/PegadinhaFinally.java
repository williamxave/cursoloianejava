package exception;

public class PegadinhaFinally {

	public static void main(String[] args) {

		int[] numero = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println(numero[i] + "/" + denom[i] + " = " + numero[i] / denom[i]);

			} catch (ArithmeticException e) {

				System.out.println("ERRO AO DIVIDIR POR ZERO");
				System.exit(0);

			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("POSSICAO DO ARRAY INVALIDA");
				System.exit(0);
			}

			finally {
				System.out.println("SEMPRE É IMPRESSA ");
			}
		}
	}
}

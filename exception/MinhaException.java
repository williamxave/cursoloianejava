package exception;

public class MinhaException {

	public static void main(String[] args) throws DivisaoNaoExata {

		int[] numero = { 4, 8, 16, 32, 21, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numero.length; i++) {

			try {
				if (numero[i] % 2 != 0) {

					throw new DivisaoNaoExata(numero[i], denom[i]);
				}

				System.out.println(numero[i] + "/" + denom[i] + " = " + numero[i] / denom[i]);

			} catch (ArithmeticException | DivisaoNaoExata | ArrayIndexOutOfBoundsException e) {

				System.out.println("ERRO AO DIVIDIR POR ZERO");

			}
		}

	}

}

package exception;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numero = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numero.length; i++) {

			try {
				System.out.println(numero[i] + "/" + denom[i] + " = " + numero[i] / denom[i]);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				e.printStackTrace();

			}
		}
	}
}

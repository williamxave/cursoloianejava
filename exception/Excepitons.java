package exception;

public class Excepitons {

	public static void main(String[] args) {
		int vet1[] = new int[4];
		int num = 1;
		
		try {
			System.out.println("==========");

			vet1[4] = num;

		} catch (ArrayIndexOutOfBoundsException exception) {

			for (int i = 0; i < vet1.length; i++) {
				if (vet1[i] == 0) {
					vet1[i] = num;
					break;
				}

			}

			System.out.println("O INDICE ESCRITO É INVALIDO, ENTAO REALOCAMOS O VALOR");
		}

		for (int i = 0; i < vet1.length; i++) {
			System.out.println(vet1[i]);
		}

	}

}

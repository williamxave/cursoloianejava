package cursojava.aula.matriz;

import java.util.Random;

public class Exercicios02 {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] a = new int[10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		String out = "";
		String out2 = "";

		for (int i = 0; i < a.length; i++) {
			System.out.print("\n " + (i + 1) + "| ");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(100);
				System.out.print("--" + a[i][j]);
			}
		}

		for (int i = 4; i <= 6; i += 2) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > maior) {

					maior = a[i][j];

					out = "O maior valor da linha " + (i + 1) + " é " + maior + " e a coluna " + (j + 1);

				}
				if (a[i][j] < menor) {

					menor = a[i][j];

					out2 = "O menor valor da linha " + (i + 1) + " é " + menor + " e a coluna " + (j + 1);
				}
			}

			System.out.println("\n" + out);
			System.out.println(out2);
		}

	}
}

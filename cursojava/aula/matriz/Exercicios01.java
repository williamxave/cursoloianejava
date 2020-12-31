package cursojava.aula.matriz;

import java.util.Random;

public class Exercicios01 {

	public static void main(String[] args) {

		int[][] matris = new int[4][4];
		Random random = new Random();
		int maior = Integer.MIN_VALUE;
		String imprimeMaior = "";

		for (int i = 0; i < matris.length; i++) {
			System.out.print("\n " + (i + 1) + "| ");
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j] = random.nextInt(100);
				System.out.print("--" + matris[i][j]);
			}
		}

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] > maior) {
					maior = matris[i][j];

					imprimeMaior = "\nO maior valor é " + maior + " e esta na linha " + (i + 1) + " e coluna " + (j + 1)
							+ " !!";
				}
			}

		}

		System.out.println(imprimeMaior);

	}
}

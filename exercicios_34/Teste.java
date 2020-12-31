package exercicios_34;

public class Teste {

	public static void main(String[] args) {
		int[] vet1 = new int[4];
		int[] vet2 = new int[vet1.length];
		int soma = 1;

		for (int i = 0; i < vet1.length; i++) {

			vet1[i] = (int) (1 + Math.random() * 5);
			System.out.println(vet1[i] + "!");

			vet2[i] = vet1[i];

			for (int j = 1, k = vet1[i]; j <= vet1[i]; j++, k--) {

				vet2[i] = vet2[i] * k;

				System.out.println(k + "--" + vet2[i]);

			}

		}

	}

}

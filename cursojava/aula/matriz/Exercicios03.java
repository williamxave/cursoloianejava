package cursojava.aula.matriz;

import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Digite os valor de: " + (i + 1) + " na coluna " + (j + 1));
				a[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(" ");

		for (int i = 0; i < a.length; i++) {
			
			System.out.print("\n||");
			
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print("--" + a[i][j]);
			}
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i][j] % 2 == 0) {
					
					System.out.println(a[i][j] + " É par");
					
				} else {
					
					System.out.println(a[i][j] + " Nao é par");
				}
			}
		}

	}

}

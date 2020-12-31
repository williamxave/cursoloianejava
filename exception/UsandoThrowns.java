package exception;

import java.util.Scanner;

public class UsandoThrowns {

	public static void main(String[] args) {

		System.out.println("Digite um numero: ");
		try {
			double num = leNumero();
		} catch (Exception e) {
			
			System.out.println("Aconteceu um erro");
			e.printStackTrace();
		}
	}

	public static double leNumero() throws Exception {

		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();

		return num;

	}
}

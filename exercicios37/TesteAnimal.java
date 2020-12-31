package exercicios37;

import java.util.ArrayList;
import java.util.Collections;

import exercicios37.comparator.ComparatorNome;

public class TesteAnimal {

	public static void main(String[] args) {

		ArrayList<Animal> animais = new ArrayList<Animal>();

		Peixe peixe = new Peixe("Tubarão", 6.0, "azul", 4);
		animais.add(peixe);
		peixe.setAnimais(animais);
		Mamifero urso = new Mamifero("Urso-do-Canada", 6, 4, "Castanho", 10);
		animais.add(urso);
		urso.setAnimais(animais);
		Mamifero camelo = new Mamifero("Camelo", 6, 4, "Rosa", 10);
		animais.add(camelo);
		camelo.setAnimais(animais);

		for (int i = 0; i < animais.size(); i++) {
			System.out.println(animais.get(i));
		}
		// Ordenada
		System.out.println("==============================================");
		
		Collections.sort(animais, new ComparatorNome());// COMPARATOR EM OUTRA CLASSE USANDO PADRAO DE ARQUITETURA
														// Strategy
		for (int i = 0; i < animais.size(); i++) {
			System.out.println(animais.get(i));
		}

	}
}

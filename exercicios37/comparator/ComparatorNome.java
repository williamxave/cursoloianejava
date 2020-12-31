package exercicios37.comparator;

import java.util.Comparator;

import exercicios37.Animal;

public class ComparatorNome implements Comparator<Animal> {

	@Override
	public int compare(Animal animal1, Animal animal2) { // COMPARA UM COM OUTRO

		if (animal1.getNome().compareTo(animal2.getNome()) > 0) {
			return 1;
		}
		return -1;
	}

}

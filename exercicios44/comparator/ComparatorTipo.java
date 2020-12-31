package exercicios44.comparator;

import java.util.Comparator;

import exercicios44.FiguraGeometrica;

public  class ComparatorTipo implements Comparator<FiguraGeometrica> {

	@Override
	public int compare(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		if (figura1.getTipo().compareTo(figura2.getTipo()) > 0) {
			return 1;
		}
		return -1;
	}
}

package exercicios44;

import java.util.ArrayList;
import java.util.Collections;

import exercicios37.comparator.ComparatorNome;
import exercicios44.comparator.ComparatorTipo;

public class TesteFiguraGeometrica {

	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(5);
		cilindro.setRaio(3);
		cilindro.setNome("CILINDRAO");
		figuras.add(cilindro);
		cilindro.setFiguras(figuras);

		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.setNome("QUADRADIN");
		figuras.add(quadrado);
		quadrado.setFiguras(figuras);

		Circulo circulo = new Circulo();
		circulo.setRaio(5);
		circulo.setNome("CIRCULAO");
		figuras.add(circulo);
		circulo.setFiguras(figuras);

		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(5);
		triangulo.setBase(4);
		triangulo.setNome("TRIANGULINHO");
		figuras.add(triangulo);
		triangulo.setFiguras(figuras);

		Cubo cubo = new Cubo();
		cubo.setLado(2);
		cubo.setNome("CUBAO");
		figuras.add(cubo);
		cubo.setFiguras(figuras);

		Piramide pira = new Piramide();
		pira.setNome("PIRAMEDEZONA DOS FARAO PIKA");
		pira.setAltura(2);
		pira.setApotema(4);
		pira.setAprestaBase(5);
		pira.setPoliBase(4);
		pira.setBase(quadrado);
		figuras.add(pira);
		pira.setFiguras(figuras);

		for (FiguraGeometrica fig : figuras) {

			if (fig instanceof Figura2D) {
				Figura2D f2d = (Figura2D) fig;
				f2d.calculaArea();
			}
			if (fig instanceof Figura3D) {
				Figura3D f3d = (Figura3D) fig;
				f3d.calculaArea();
				f3d.calculaVomule();
			}

			System.out.println(fig);
		}
		System.out.println("=====================================");
		System.out.println("=====================================");

		
		// Array ORDENADA
		Collections.sort(figuras, new ComparatorTipo());

		for (FiguraGeometrica fig : figuras) {

			System.out.println(fig);
		}
	}

}

package exercicios44;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;

	

	@Override
	public double calculaArea() {

		return (base * altura) /2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return super.toString() +"\nArea: " + calculaArea();
	}

	
	
}

package exercicios44;

public class Quadrado extends Figura2D {

	private int lado;

	@Override
	public double calculaArea() {
		return Math.pow(lado, 2);
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea: " + calculaArea();

	}
}

package exercicios44;

public class Cubo extends Figura3D {

	private double lado;

	@Override
	public double calculaVomule() {
		return Math.pow(lado, 3);
	}

	@Override
	public double calculaArea() {
		return Math.pow(lado, 2) * 6;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea: " + calculaArea() + "\nVolume: " + calculaVomule();
	}

}

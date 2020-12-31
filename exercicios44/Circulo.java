package exercicios44;

public class Circulo extends Figura2D {

	private int raio;

	@Override
	public double calculaArea() {
		return Math.PI * (Math.pow(raio, 2));
	}
	
	public int getRaio() {
		return raio;
	}
	
	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return super.toString() +"\nArea: " + calculaArea();
	}
	

}

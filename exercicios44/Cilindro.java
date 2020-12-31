package exercicios44;

public class Cilindro extends Figura3D {

	private double altura;
	private double raio;

	@Override
	public double calculaArea() {

		double base = Math.PI * Math.pow(raio, 2);
		double lateral = (2 * Math.PI) * (raio * altura);
		double total = Math.pow(base, 2) + lateral;
		
		return total;
	}

	@Override
	public double calculaVomule() {

		return (Math.PI * Math.pow(raio, 2)) * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return super.toString() +"\nArea: " + calculaArea() + "\nVolume: " +calculaVomule();
	}

	
}

package exercicios44;

public class Piramide extends Figura3D {

	private double altura;
	private double aprestaBase;
	private double apotema;
	private int poliBase;
	private Figura2D base;

	@Override
	public double calculaArea() {
		if (base != null) {
			return (poliBase * ((aprestaBase * apotema) / 2)) + base.calculaArea();
		}
		return 0;
	}

	@Override
	public double calculaVomule() {
		if (base != null) {
			return (base.calculaArea() * altura) / 3;
		}
		return 0;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAprestaBase() {
		return aprestaBase;
	}

	public void setAprestaBase(double aprestaBase) {
		this.aprestaBase = aprestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public int getPoliBase() {
		return poliBase;
	}

	public void setPoliBase(int poliBase) {
		this.poliBase = poliBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return super.toString() +"\nArea: " + calculaArea() + "\nVolume: " +calculaVomule();
	}
	
	

}

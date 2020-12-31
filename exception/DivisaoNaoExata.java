package exception;

public class DivisaoNaoExata extends Exception {

	private int num;
	private int dem;

	public DivisaoNaoExata(int numero, int dem) {
		super();
		this.num = numero;
		this.dem = dem;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Resultado de: " + num + " / " + dem + " não é um inteiro";
	}

}

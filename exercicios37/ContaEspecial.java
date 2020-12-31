package exercicios37;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	private boolean isEspecial;

	public ContaEspecial(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
		fazEspecial();
		addLimite();
	}

	public void fazEspecial() {
		isEspecial = true;
	}

	public void addLimite() {
		if (isEspecial == true) {
			limite = 1000.00;
		}
	}

	public boolean sacar(double saque) {
		if (saldo >= 0 && saque <= saldo) {
			saldo -= saque;
			return true;
		} else if (isEspecial == true) {
			if (saque <= (saldo + limite)) {
				saldo = saldo - saque;
				limite += saldo;
				return true;
			}
		}
		return false;
	}

	public boolean isEspecial() {
		return isEspecial;
	}

	public void setEspecial(boolean isEspecial) {
		this.isEspecial = isEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta Especial\nNome: " + super.getNomeCliente() + "\nNumero da Conta: " + super.getNumConta()
				+ "\nSaldo: " + super.getSaldo() + "\nLimite: " + limite;

	}

}

package exercicios37;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	private double total = 0;

	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;

	}

	public double verificaRendimento(int dias) {
		double rendimento = 0.05;
		total = (rendimento * dias);
		return total;
	}

	public void addRendimento() {
		saldo += total;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "Conta Poupanca\nNome: " + super.getNomeCliente() + "\nNumero da Conta: " + super.getNumConta()
				+ "\nSaldo: " + super.getSaldo() + "\n";
	}

}

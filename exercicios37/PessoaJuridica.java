package exercicios37;

public class PessoaJuridica extends ReceitaFederal {

	private double saldo;

	public PessoaJuridica(String nome, double saldo) {
		super(nome);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void calculaRenda() {
		double renda = 0.1;
		if(saldo >= 0) {
		renda = saldo * renda;
		}
		saldo -= renda;
	}

	@Override
	public String toString() {
		return "PessoaJuridica \nNome: "+ super.getNome() +" \nSaldo: " + saldo;
	}
}

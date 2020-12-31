package exercicios37;

public class PessoaFisica extends ReceitaFederal {

	private double saldo;

	public PessoaFisica(String nome, double saldo) {
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
		double renda = 0;
		if (saldo >= 1400.01 && saldo <= 2100) {
			renda = 0.1;
			renda = saldo * renda;
			saldo -= renda;
		} else if (saldo >= 2100.01 && saldo <= 2800) {
			renda = 0.15;
			renda = saldo * renda;
			saldo -= renda;
		} else if (saldo >= 2800.01 && saldo <= 3600) {
			renda = 0.25;
			renda = saldo * renda;
			saldo -= renda;
		} else if (saldo > 3600) {
			renda = 0.3;
			renda = saldo * renda;
			saldo -= renda;
		}else {
			
		}

	}

	@Override
	public String toString() {
		return "PessoaFisica \nNome: "+ super.getNome() +" \nSaldo: " + saldo;
	}
}

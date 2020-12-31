package exercicios_25_27;

public class ContaCorrente {

	private String nome;
	private int id;
	private double saldo;
	private boolean especial;
	private double saldoExtra;
	private boolean usarExtra;

	public ContaCorrente(String nome, int id, double saldo) {

		this.nome = nome;
		this.id = id;
		this.saldo = saldo;
	}

	public void verificaEspecial() {
		if (saldoExtra == 800 && especial == true) {
			System.out.println("Voc ainda nao usou o cheque especial");
		} else if (saldoExtra < 800 && especial == true) {
			System.out.println("Voc usou o cheque especial");
		} else {
			System.out.println("Você nao tem saldo extra");
		}
	}

	public double getSaldoExtra() {
		return saldoExtra;
	}

	public void setSaldoExtra(double saldoExtra) {
		this.saldoExtra = saldoExtra;
	}

	public double depositar(double dinheiros) {
		saldo += dinheiros;
		return saldo;
	}

	public void fazerSaque(double saque) {
		if (saque <= saldo) {
			saldo = saldo - saque;
		} else if (especial) {
			
			if (saque <= (saldo + saldoExtra)) {
				saldo = saldo - saque;
				saldoExtra += saldo;
			}else {
				System.out.println("you not have money");
			}

		} else {
			System.out.println("you not have money");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		especial = true;
		saldoExtra = 800;
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

}

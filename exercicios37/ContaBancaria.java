package exercicios37;

import java.util.ArrayList;

public abstract class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	protected double saldo;
	ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {

		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(ArrayList<ContaBancaria> contas) {
		this.contas = contas;
	}

	public boolean sacar(double saque) {
		if (saldo >= 0 && saldo >= saque) {
			saldo -= saque;
			return true;
		}
		return false;
	}

	public void depositar(double deposito) {
		saldo += deposito;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ada() {
		System.out.println(super.toString());
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + ", contas="
				+ contas + "]";
	}

}

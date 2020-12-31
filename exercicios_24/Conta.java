package exercicios_24;

public class Conta {

	private String nome;
	private int id;
	private double saldo;
	private double limiteExtra;
	private boolean especial;
	private double compraTotal;
	private double comprar;

	public Conta(String nome, int id, double saldo) {

		this.nome = nome;
		this.id = id;
		this.saldo = saldo;

	}

	public void compralimite(double comprar) {
 
		if (comprar < saldo || comprar == saldo) {
			saldo = comprar - saldo;
			
		} else if (comprar > saldo) {
			
			if (comprar - saldo < -1) {
				saldo = saldo + limiteExtra;
				saldo = comprar - saldo;
			} else {
				System.out.println("Voc nao tem dinheiro o suficiente");
			}
			
		} else {
			System.out.println("CARTAO INVALIDO");
		}
	}

	// Metodos Extras
	public void exibeDados() {

		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
	}

	public void fazEspecial() {
		especial = true;
		if (especial == true) {
			limiteExtra = 800;
			saldo += limiteExtra;
		}
	}

	public void verificaEspicial() {
		if (especial == true) {
			System.out.println("Sua conta é especial e com isso tem um limite extra de R$800.00");
		} else {
			System.out.println("Sua conta não é especial. Verifica no caixa como virar especial");
		}
	}

	// ********

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
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

}

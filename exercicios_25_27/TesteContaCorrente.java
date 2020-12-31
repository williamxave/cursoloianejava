package exercicios_25_27;

public class TesteContaCorrente {

	public static void main(String[] args) {
	
		ContaCorrente conta = new ContaCorrente("EUZIN", 12,10000000);
		conta.isEspecial();
		conta.fazerSaque(10000800);
		System.out.println("Seu saldo é: "+ conta.getSaldo());
		conta.verificaEspecial();
		System.out.println(" ");
		System.out.println("Seu saldo é: "+ conta.getSaldo());
		System.out.println("Cheque especial: "+conta.getSaldoExtra());
		

	}

}

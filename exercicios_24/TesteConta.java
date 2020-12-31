package exercicios_24;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta =  new Conta("William", 12, 1000.00);
	    conta.exibeDados();
	    conta.fazEspecial();
	    conta.verificaEspicial();
	    System.out.println("Seu saldo é de "+conta.getSaldo());
	    conta.compralimite(1500.00);
	    System.out.println("Seu saldo é de "+conta.getSaldo());
	}

}

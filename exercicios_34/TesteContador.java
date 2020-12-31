package exercicios_34;

public class TesteContador {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		System.out.println(Contador.mostraContador());
		Contador.addContador();
		Contador.addContador();
		Contador.addContador();
		Contador.addContador();
		Contador.addContador();
		Contador.addContador();
		Contador.addContador();
		Contador.addContador();
		System.out.println(Contador.mostraContador());
		Contador.zeraContador();
		System.out.println(Contador.mostraContador());


	}

}

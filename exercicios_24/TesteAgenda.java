package exercicios_24;

public class TesteAgenda {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("XAXA", "@pinto", "RUA DO BUMBUM", "9999");
		
		agenda.addNumber("88888");
		agenda.exibeDados();
		
		agenda.addNumber("1223232");
		agenda.exibeDados();
		agenda.addNumber("565656");

	}

	

}

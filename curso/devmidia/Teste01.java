package curso.devmidia;

public class Teste01 {

	public static void main(String[] args) {
	
		HorarioOnibus hora = new HorarioOnibus();
		
		System.out.println(hora.noHorario(14, 15) + " Esta no horario");
		System.out.println(hora.emAtraso(14, 16) +  " Nao esta no horario");
	}

}

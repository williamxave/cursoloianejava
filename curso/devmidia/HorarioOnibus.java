package curso.devmidia;

public class HorarioOnibus {

	public boolean noHorario(int minutoAnterior, int minutoAtual) {
		return minutoAtual - minutoAnterior  <=  15;
	}
	public boolean emAtraso(int minutoAnterior, int minutoAtual) {
		return minutoAtual - minutoAnterior > 15;
	}
}

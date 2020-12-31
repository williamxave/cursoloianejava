package exercicios_24;

import java.util.Date;

public class TesteLivroBiblioteca {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca("nao sei", "EU", " dRAMA");
		livro.alugar();
		livro.setDataPegar(new Date());
		System.out.println(" ");
		livro.verificaAlugado();
		livro.exibeDados();
	}

}

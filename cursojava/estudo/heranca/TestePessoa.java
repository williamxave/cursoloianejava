package cursojava.estudo.heranca;

public class TestePessoa {

	public static void main(String[] args) {

		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		
		professor.setEndereco("Rua 2, num 2");
		aluno.setEndereco("Rua 3 , num 3");

		
		System.out.println(professor.obterEtiqueta());
		System.out.println(aluno.obterEtiqueta());

	}

}

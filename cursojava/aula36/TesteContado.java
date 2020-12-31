package cursojava.aula36;

public class TesteContado {

	public static void main(String[] args) {

		Contado contado = new Contado();

		// criar objeto endereco

		Endereco endereco = new Endereco();
		endereco.setNomeRua("VITAR");
		endereco.setCidade("BP");
		endereco.setCep("9765000");
		endereco.setComplemento("casa");
		endereco.setEstado("RS");
		endereco.setNumero("69");

		Telefone telefone = new Telefone();
		telefone.setDdd("11");
		telefone.setNumero("9999-9999");
		telefone.setTipo("celular");

		Telefone telefone2 = new Telefone();
		telefone2.setDdd("11");
		telefone2.setNumero("3333-3333");
		telefone2.setTipo("casa");
		
		contado.setNome("XAXA");
		contado.setEndereco(endereco);

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		contado.setTelefones(telefones);

		System.out.println(contado.getNome());

		if (contado != null && contado.getEndereco() != null) {
			System.out.println(contado.getEndereco().getCidade());
		}
		if (contado != null && contado.getTelefones() != null) {
			for(Telefone t : contado.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}

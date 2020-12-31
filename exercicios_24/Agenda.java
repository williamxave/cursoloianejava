package exercicios_24;

public class Agenda {

	private String nome;
	private String email;
	private String endereco;
	private String[] numeros;
	private String numero;
	private String out;

	public Agenda(String nome, String email, String endereco, String number) {

		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.numero = number;
		addNumber(number);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNumeros(String number) {
		for (int i = 0; i < numeros.length; i++) {

		}

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void addNumber(String number) {
		String[] numeros = new String[2];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == null) {
				numeros[i] = number;
				System.out.println("Numeros: " +numeros[i]);
				break;
			}else if(numeros[i] != null) {
				numeros[1] = number;
				System.out.println("Numeros: " +numeros[i]);
			}else {
			      out = "ERRO";
			}

		}

	}

	public void getNumeros(String[] numeros) {

		for (int i = 0; i < numero.length(); i++) {

			System.out.println("Numeros: " + numeros[i]);
		}

	}

	public void exibeDados() {

		System.out.println("Nome: " + nome); 
		System.out.println("Email: " + email);
		System.out.println("Endereço: " + endereco);
		System.out.println("Numero: " + numero);
	}

}

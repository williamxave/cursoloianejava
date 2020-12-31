package exercicios_24;

import java.util.Date;

public class LivroBiblioteca {

	private String nome;
	private String autor;
	private String tipo;
	private boolean alugado;
	private Date dataPegar;

	public LivroBiblioteca(String nome, String autor, String tipo) {

		this.nome = nome;
		this.autor = autor;
		this.tipo = tipo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
	public Date getDataPegar() {
		return dataPegar;
	}
	public void setDataPegar(Date dataPegar) {
		
		this.dataPegar = dataPegar;
	}
			

	public void exibeDados() {

		System.out.println("Nome: " + nome);
		System.out.println("Autor: " + autor);
		System.out.println("Tipo: " + tipo);
		System.out.println("Alugado: " + alugado);
		System.out.println("Data: "+dataPegar);
	}

	public void alugar() {
		alugado = true;
	}

	public void verificaAlugado() {
		if (alugado == true) {
			System.out.println("Esta alugado");
		} else {
			System.out.println("Não esta alugado");
		}
	}

}

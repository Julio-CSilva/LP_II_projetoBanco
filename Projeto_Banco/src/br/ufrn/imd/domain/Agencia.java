package br.ufrn.imd.domain;

public class Agencia {

	private String endAgencia;
	private Banco bancoCadastrado;
	private int id;
	
	public String getEndAgencia() {
		return endAgencia;
	}
	public void setEndAgencia(String endAgencia) {
		this.endAgencia = endAgencia;
	}
	public Banco getBancoCadastrado() {
		return bancoCadastrado;
	}
	public void setBancoCadastrado(Banco bancoCadastrado) {
		this.bancoCadastrado = bancoCadastrado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

package br.ufrn.imd.domain;

public class Agencia {

	private String endAgencia;
	private Banco bancoCadastrado;
	private int id;
	
	public Agencia(int id) {
		setId(id);
	}
	
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
	
	@Override
	public String toString() {
		return "Id da Agência: "+getId()+"\n Endereço: "+getEndAgencia()+" Banco: "+bancoCadastrado.getNome();
	}
	
}

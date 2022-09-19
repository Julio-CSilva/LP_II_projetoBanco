package br.ufrn.imd.domain;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	
	public void transferencia(float valor, int conta) {
		contas.get(conta).addValor(valor);
	}
	
	@Override
	public String toString() {
		return "Banco [id: " + getId() + "nome: " + nome + "]";
	}
	
	

}

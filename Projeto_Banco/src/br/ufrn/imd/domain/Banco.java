package br.ufrn.imd.domain;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> Contas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return Contas;
	}
	public void setContas(List<Conta> contas) {
		Contas = contas;
	}
	
}

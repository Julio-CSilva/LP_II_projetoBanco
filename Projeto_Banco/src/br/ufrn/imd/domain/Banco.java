package br.ufrn.imd.domain;

import java.util.List;

public class Banco extends Agencia{

	private String nome;
	private List<Conta> contas;
	
	public Banco(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void transferencia(float valor, int conta) {
		contas.get(conta).addValor(valor);
	}
	
	@Override
	public String toString() {
		return "Banco [nome: " + nome + "]";
	}
	
	

}

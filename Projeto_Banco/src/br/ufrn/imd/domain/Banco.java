package br.ufrn.imd.domain;

import java.util.List;
import java.util.ArrayList;

public class Banco {

	private String nome;
	private List<Conta> contas;

	
	public Banco() {
		contas = new ArrayList<Conta>();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta(int id) {
		return contas.get(id);
	}
	public void addConta(Conta conta){
		contas.add(conta);
	}
	
	public void transferencia(float valor, int conta) {
		contas.get(conta).addValor(valor);
	}
	
	
	

}

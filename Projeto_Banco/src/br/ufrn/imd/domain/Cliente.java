package br.ufrn.imd.domain;

import java.util.List;
import java.util.ArrayList;

public class Cliente  extends Pessoa{

	private int id;
	private List<Conta> contas;
	private int idconta = 0;


	public Cliente() {
	}

	public Cliente(int id) {
		this.id = id;
		contas = new ArrayList<Conta>();
	}

	//getters e setters
	public int getIdconta() {
		int idtemp = 0;
		idtemp = this.idconta;
		this.idconta++;
		return idtemp;
	}
	public void addConta(Conta conta){
		contas.add(conta);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Conta getConta(int id) {
		return contas.get(id);
	}
	public List<Conta> getContas() {
		return contas;
	}
	

	//metodos
	public void receber(float valor, int id){
		contas.get(id).addValor(valor);
	}

	public void transferir(int valor, int id){
		contas.get(id).retirarValor(valor);
	}

	@Override
	public String toString() {
		return "Cliente [id: " + id + ", Nome: " + getNome() + ", Cpf: " + getCpf() + "]";
	}
	
	
}

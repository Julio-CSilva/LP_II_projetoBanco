package br.ufrn.imd.domain;

import java.util.List;

public class Conta {

	private int id;
	private String tipo;
	private String status;
	private float saldo;
	private List<String> historico;
	private Banco banco;
	
	public Conta(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public List<String> getHistorico() {
		return historico;
	}
	public void setHistorico(List<String> historico) {
		this.historico = historico;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	//metodos
	public void addValor(float valor){
		this.saldo += valor;
	}

	public void retirarValor(float valor){
		this.saldo -= valor;
	}
	
	public void emprestimo(float valor) {
		if(this.status == "Ativa") {
			addValor(valor);
		} else {
			System.out.println("Não é possivel realizar está ação a conta selecionada está desativada!");
		}
	}
	
	public void desativarConta() {
		setStatus("Desativada");
	}

	@Override
	public String toString() {
		return "Conta [id: " + id + ", tipo: " + tipo + ", status: " + status + ", banco: " + banco + "]";
	}
	
	
	
	
}

package br.ufrn.imd.domain;

import java.util.List;

public class Conta {

	private int id;
	private String tipo;
	private String status;
	private float saldo;
	private List<String> historico;
	private List<Cliente> clientes;
	
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
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}

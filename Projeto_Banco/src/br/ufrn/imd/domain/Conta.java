package br.ufrn.imd.domain;

public class Conta {

	private int id;
	private String tipo;
	private String status;
	private float saldo;
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
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	//metodos
	public void addValor(float valor){
		this.saldo = saldo + valor;
	}

	public void retirarValor(float valor){
		this.saldo = saldo - valor;
	}
	
	public void emprestimo(float valor) {
		if(this.status == "Ativa") {
			addValor(valor);
		} else {
			System.out.println("Não é possivel realizar está ação a conta selecionada está desativada!");
		}
	}
	
	public void ativardesativarConta() {
		if(this.status == "Ativada"){
			setStatus("Desativada");
		} else {
			setStatus("Ativada");
		}
	}

	@Override
	public String toString() {
		return "Conta [id: " + id + ", tipo: " + tipo + ", status: " + status + ", banco: " + banco.getNome() + ", saldo: " + getSaldo() + "]";
	}
	
	
	
	
}

package br.ufrn.imd.domain;

public class Cliente  extends Pessoa{

	private int id;
	private List<Conta> contas;
	private int idconta = 0;


	public Cliente() {
	}
	public Cliente(int id) {
		this.id = id;
	}

	//getters e setters
	public int getIdconta() {
		int idtemp = 0;
		idtemp = this.idconta;
		this.idconta++;
		return idtemp;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<Conta> getContas() {
		return contas;
	}

	//metodos
	public void receber(float valor){
		conta.addValor(valor);
	}

	public void transferir(int valor){
		conta.retirarValor(valor);
	}

	@Override
	public String toString() {
		return "Cliente [id: " + id + ", Nome: " + getNome() + ", Cpf: " + getCpf() + "]";
	}
	
	
}

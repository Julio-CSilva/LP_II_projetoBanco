package br.ufrn.imd.domain;

import java.util.Scanner;
import java.util.Calendar;
import java.util.List;

public class Interface {

    private int id_agencias = 0;
	private int id_clientes = 0;

    public Interface() {
      }

    public void op_gerais(){
        System.out.println("Sistema Bancario \nDigite a opção desejada: \n1 - Cadastrar Agencia e Banco \n2 - Cadastrar Cliente \n3 - Opções de cliente \n4 - Fechar programa");
    }

    //case 1
    public Agencia op_criar_agencia(Scanner sc){
        //criação da agencia pt.1
        Agencia agencia = new Agencia(id_agencias);
        this.id_agencias++;
        System.out.println("Digite o endereço da Agencia em uma linha: ");
        agencia.setEndAgencia(sc.nextLine());

        //criação do banco da agencia
        System.out.println("Agora, vamos criar um Banco para a sua Agencia! Comece digitando um nome para o Banco: ");
        Banco banco = new Banco();
        banco.setNome(sc.nextLine());
        
        //finalização da agencia
        agencia.setBancoCadastrado(banco);
        
        System.out.println("Agencia criada com sucesso!");
        return agencia;
    }

    //case 2
    public Cliente op_criar_cliente(Scanner sc){
        //criação do cliente
        Cliente cliente = new Cliente(id_clientes);
        this.id_clientes++;
        System.out.println("Digite o nome do novo cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite o cpf d@ " + cliente.getNome() + ": ");
        cliente.setCpf(sc.nextLine());
        System.out.println("Digite a data de nascimento d@ " + cliente.getNome() +" (apenas numeros separados por espaço): ");
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(Calendar.DATE, sc.nextInt());
        dataNascimento.set(Calendar.MONTH, sc.nextInt());
        dataNascimento.set(Calendar.YEAR, sc.nextInt());
        cliente.setDataNascimento(dataNascimento.getTime());
        sc.nextLine();

        System.out.println("Cliente criado com sucesso!");
        return cliente;
    }

    //case 3
    public void msg_erro_op_cliente(){
        System.out.println("ERRO! Crie uma agencia e um cliente primeiro!");
    }
    public void msg_op_cliente(){
        System.out.println("Selecione o perfil de cliente desejado, digitando seu respectivo id: ");
    }
    public void op_cliente(Scanner sc, Cliente cliente, List<Agencia> agencias){
        boolean sistemaCliente = true;
        //menu de opções do cliente
        while(sistemaCliente == true){
            System.out.println("Menu do Cliente\nDigite a opção desejada: "
            		+ "\n1 - Criar uma conta bancaria "
            		+ "\n2 - transferir dinheiro "
            		+ "\n3 - Emprestimo "
            		+ "\n4 - Ativar ou Desativar uma conta "
            		+ "\n5 - Ver contas"
            		+ "\n6 - Voltar para o menu anterior");
            
            switch(sc.nextInt()){
                case 1:
                sc.nextLine();
                Conta conta = new Conta(cliente.getIdconta());
                //selecionar o banco
                System.out.println("Digite o id da agencia com o banco onde deseja criar a conta, digitando seu respectivo id: ");
			    for(Agencia d : agencias){
				    System.out.println(d);
		  	    }
                int idbanco = sc.nextInt();
                conta.setBanco(agencias.get(idbanco).getBancoCadastrado());
                sc.nextLine();
                conta.setStatus("Ativada");
                //tipo de conta
                System.out.println("Qual tipo de conta você esta criando? Digite o nome da opção desejada:\n-Corrente\n-Poupança");
                conta.setTipo(sc.nextLine());
                //adicionar saldo
                System.out.println("Quanto deseja depositar na conta? ");
                conta.setSaldo(sc.nextFloat());
                agencias.get(idbanco).getBancoCadastrado().addConta(conta);
                cliente.addConta(conta);
                
                break;
                case 2:
                    sc.nextLine();
                    int idconta = 0;
                    int idbanco2 = 0;
                    int iddestinatario = 0;
                    float valortransferencia = 0;

                    System.out.println("Digite o id da sua conta a ser usada na transferencia: ");
                    for(Conta d : cliente.getContas()){
                        System.out.println(d);
                      }
                    idconta = sc.nextInt();

                	System.out.println("Digite o id da agencia com o banco do destinatario: ");
                	for(Agencia d : agencias){
                        System.out.println(d);
                      }
                    idbanco2 = sc.nextInt();

                    System.out.println("Digite o id da conta do destinatario: ");
                	iddestinatario = sc.nextInt();

                    System.out.println("Digite o valor a ser transferido: ");
                    valortransferencia = sc.nextFloat();

                    if(cliente.getConta(idconta).getStatus() == "Ativada" && cliente.getConta(idconta).getSaldo() >= valortransferencia) {
                        agencias.get(idbanco2).transferencia(valortransferencia, iddestinatario);
                        cliente.getConta(idconta).retirarValor(valortransferencia);

                    } else {
                        System.out.println("Conta sem saldo, ou desativada...\n");

                    }

                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Selecione a conta que deseja realizar o emprestimo: ");
                    for(Conta d : cliente.getContas()){
                    System.out.println(d);
                    }
                    
                    int idconta3 = sc.nextInt();

                    if(cliente.getConta(idconta3).getStatus() == "Ativada"){
                        System.out.println("Valor do emprestimo: ");
                        float valorR = sc.nextFloat();
                        cliente.getConta(idconta3).addValor(valorR);
                    } else {
                        System.out.println("Conta desativada, selecione outra conta por favor!\n");
                    }

                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Selecione a conta que deseja ativar ou desativar: ");
                    for(Conta d : cliente.getContas()){
                    System.out.println(d);
                    }

                    idconta = sc.nextInt();
                    
                    cliente.getConta(idconta).ativardesativarConta();

                    
                    break;
                case 5:
                	for(Conta d : cliente.getContas()){
                        System.out.println(d+"\n");
                        }
                	break;
                
                case 6:
                	sistemaCliente = false;
                    break;
                
                default:
                	System.out.println("Opção invalida!");
                	break;
            }
        }
    }
    
}

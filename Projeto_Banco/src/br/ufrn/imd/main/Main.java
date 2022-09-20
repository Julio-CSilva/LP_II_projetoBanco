package br.ufrn.imd.main;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import br.ufrn.imd.domain.Agencia;
import br.ufrn.imd.domain.Cliente;
import br.ufrn.imd.domain.Interface;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
	
    Interface menu = new Interface();

		boolean sistema = true;

		//Lista de Agencias e Clientes
		List<Agencia> agencias;
		agencias = new ArrayList<Agencia>();
		List<Cliente> clientes;
		clientes = new ArrayList<Cliente>();
	

    try{
      while(sistema == true){
        
		menu.op_gerais();
        int op = sc.nextInt();

        switch(op){
          case 1: 
		  sc.nextLine();
		  agencias.add(menu.op_criar_agencia(sc));
		  break;

		  case 2:
		  sc.nextLine();
		  clientes.add(menu.op_criar_cliente(sc));
		  break;

		  case 3:
		  sc.nextLine();
		  if(agencias != null && clientes != null){
			menu.msg_op_cliente();
			Cliente cliente_menu = new Cliente();
		  	for(Cliente d : clientes){
				System.out.println(d);
		  	}
			cliente_menu = clientes.get(sc.nextInt());
			sc.nextLine();
			menu.op_cliente(sc, cliente_menu, agencias);
		  } else {
			menu.msg_erro_op_cliente();
		  }
		  break;

		  case 4:
		  sistema = false;
		  break;

		  default:
		  System.out.println("O número escolhido é inválido!");

        }

      }
      
    } finally {
			sc.close();
		}
    
  }
  
}
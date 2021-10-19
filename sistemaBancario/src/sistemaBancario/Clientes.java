package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
	
	ArrayList <DadosCliente> clientes = new ArrayList<DadosCliente>();
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroCliente() 
	{
		boolean res = true;
		
		System.out.println("Cadastro de Clientes");
	    
	    do {
	    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
	    	int resp = teclado.nextInt();
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	System.out.println("Digite o telefone:");
		    	String telefone = teclado.next();
		    	DadosCliente cliente = new DadosCliente(nome,telefone); 
	    		if(cliente != null) {
	    			clientes.add(cliente);
	    		}
	    	}
	    	else {
	    		res=false;
	    	}
	    	
	    }while (res==true);
	}
	
	public void buscaCliente() 
	{
		boolean res = true;
		System.out.println("Busca de Clientes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosCliente cliente = new DadosCliente(nome);
		    	for(DadosCliente elemento : clientes) {
					if(elemento.getNome().equalsIgnoreCase(cliente.getNome())) {
						System.out.printf("Nome: %s \t Telefone:%s\n", elemento.getNome(),elemento.getTelefone());
						
					}
					
				}
				
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
	
	public void removeClientes() 
	{
		boolean res = true;
		System.out.println("Remoção de Clientes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosCliente cliente = new DadosCliente(nome);
	    		clientes.removeIf((elemento)->elemento.getNome().equalsIgnoreCase(cliente.getNome()));
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
	
	public void editarCliente() 
	{
		boolean res = true;
		System.out.println("Editar os Clientes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosCliente cliente = new DadosCliente(nome);
		    	System.out.println("Digite o novo nome:");
		    	String nomeNovo = teclado.next();
		    	System.out.println("Digite o novo telefone:");
		    	String telefoneNovo = teclado.next();
		    	DadosCliente novoCliente = new DadosCliente(nomeNovo,telefoneNovo);
		    	for(DadosCliente elemento : clientes) {
	    			if(elemento.getNome().equalsIgnoreCase(cliente.getNome())) {
	    				int indice = clientes.indexOf(elemento);
	    	    		if(indice != -1) {
	    	    			clientes.set(indice, novoCliente);
	    	    		}
	    			}
		    	}
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}

	public String listarCliente() 
	{
		StringBuilder builder = new StringBuilder();
		for(DadosCliente cliente : this.clientes) {
			builder.append("Nome: "+cliente.getNome()+" - Telefone: "+cliente.getTelefone()+"\n");
		}
		return builder.toString();
	}
}
package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Contas {

	ArrayList <DadosConta> contas = new ArrayList<DadosConta>();
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroConta() 
	{
		boolean res = true;
		
		System.out.println("Cadastro de Contas");
	    
	    do {
	    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
	    	int resp = teclado.nextInt();
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	System.out.println("Digite o valor:");
		    	float valor = teclado.nextFloat();
		    	DadosConta conta = new DadosConta(nome,valor); 
	    		if(conta != null) {
	    			contas.add(conta);
	    		}
	    	}
	    	else {
	    		res=false;
	    	}
	    	
	    }while (res==true);
	}
	
	public void buscaConta() 
	{
		boolean res = true;
		System.out.println("Busca de Contas");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosConta conta = new DadosConta(nome);
	    		for(DadosConta elemento : contas) {
	    			if(elemento.getNome().equalsIgnoreCase(conta.getNome())) {
	    				System.out.printf("Nome: %s \t Saldo:%.2f\n", elemento.getNome(),elemento.getSaldo());
	    			}
	    		}
	    		
	    		
	    	}
	    	else {
	    		res=false;
	    		
	    	}
		}while (res==true);
	}
	
	public void removeConta() 
	{
		boolean res = true;
		System.out.println("Remoção de Contas");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosConta conta = new DadosConta(nome);
	    		contas.removeIf((elemento)->elemento.getNome().equalsIgnoreCase(conta.getNome()));
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}
	
	public void editarConta() 
	{
		boolean res = true;
		System.out.println("Editar os Contas");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosConta conta = new DadosConta(nome);
		    	System.out.println("Digite o novo nome:");
		    	String nomeNovo = teclado.next();
		    	System.out.println("Digite o novo saldo:");
		    	float valorNovo = teclado.nextFloat();
		    	DadosConta novaConta = new DadosConta(nomeNovo,valorNovo);
		    	for(DadosConta elemento : contas) {
	    			if(elemento.getNome().equalsIgnoreCase(conta.getNome())) {
	    				int indice = contas.indexOf(elemento);
	    	    		if(indice != -1) {
	    	    			contas.set(indice, novaConta);
	    	    		}
	    			}
		    	}
	    	}
	    	else {
	    		res=false;
	    	}
		}while (res==true);
	}

	public String listarConta() 
	{
		StringBuilder builder = new StringBuilder();
		for(DadosConta conta : this.contas) {
			builder.append("Nome: "+conta.getNome()+" - Valor: "+conta.getSaldo()+"\n");
		}
		return builder.toString();
	}
}
  
package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerentes {
	
	ArrayList <DadosGerente> gerentes = new ArrayList<DadosGerente>();
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroGerente( ){
		boolean res = true;
		
		System.out.println("Cadastro de Gerentes");
	    
	    do {
	    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
	    	int resp = teclado.nextInt();
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	System.out.println("Digite o telefone:");
		    	String telefone = teclado.next();
		    	DadosGerente gerente = new DadosGerente(nome,telefone); 
	    		if(gerente != null) {
	    			gerentes.add(gerente);
	    		}
	    	}
	    	
	    	else {
	    		res=false;
	    	}
	    	
	    }
	    
	    while (res==true);
	}
	
	public void buscaGerente() {
		boolean res = true;
		System.out.println("Busca de Gerentes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1)  {
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosGerente gerente = new DadosGerente(nome);
	    		for(DadosGerente elemento : gerentes) {
	    			if(elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
	    				System.out.printf("Nome: %s \t Telefone:%s\n", elemento.getNome(),elemento.getTelefone());
	    			}
	    		}
	    		
	    		
	    	}
	    	
	    	else {
	    		res=false;
	    	}
		} 
		
		while (res==true);
	}
	
	public void removeGerente() 
	{
		boolean res = true;
		System.out.println("Remoção de Gerentes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1) 
	    	{
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosGerente gerente = new DadosGerente(nome);
	    		gerentes.removeIf((elemento)->elemento.getNome().equalsIgnoreCase(gerente.getNome()));
	    	}
	    	
	    	else {
	    		res=false;
	    	}
	    	
		}
		
		while (res==true);
	}
	
	public void editarGerente() {
		boolean res = true;
		System.out.println("Editar os Gerentes");
		do {
    	System.out.println("Digite uma opção (1 - Continuar, 2 - Sair):");
    	int resp = teclado.nextInt();
    	
	    	if(resp == 1)  {
	    		System.out.println("Digite o nome:");
		    	String nome = teclado.next();
		    	DadosGerente gerente = new DadosGerente(nome);
		    	System.out.println("Digite o novo nome:");
		    	String nomeNovo = teclado.next();
		    	System.out.println("Digite o novo telefone:");
		    	String telefoneNovo = teclado.next();
		    	DadosGerente novoGerente = new DadosGerente(nomeNovo,telefoneNovo);
		    	for(DadosGerente elemento : gerentes) {
	    			if(elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
	    				int indice = gerentes.indexOf(elemento);
	    	    		if(indice != -1) {
	    	    			gerentes.set(indice, novoGerente);
	    	    		}
	    			}
		    	}
	    	}
	    	
	    	else {
	    		res=false;
	    	}
		}
		
		while (res==true);
	}

	public String listarGerente() 	{
		StringBuilder builder = new StringBuilder();
		for(DadosGerente gerente : this.gerentes) {
			builder.append("Nome: "+gerente.getNome()+" - Telefone: "+gerente.getTelefone()+"\n");
		}
		return builder.toString();
	}
}
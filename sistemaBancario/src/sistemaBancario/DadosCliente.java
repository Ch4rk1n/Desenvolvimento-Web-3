package sistemaBancario;

public class DadosCliente {
	
	private String nome;
	private String telefone;
	
	DadosCliente(String nome,String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	DadosCliente(String nome){
		this.nome = nome;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}

}
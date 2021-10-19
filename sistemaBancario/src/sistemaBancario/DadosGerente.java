package sistemaBancario;

public class DadosGerente {

	private String nome;
	private String telefone;
	
	DadosGerente(String nome,String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	DadosGerente(String nome){
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
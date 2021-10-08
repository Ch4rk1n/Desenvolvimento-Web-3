package hospital;

public class Paciente {
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private Endereco endereco;
	
	public Paciente(String nomeCompleto, String cpf, String telefone,Endereco endereco) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		// Adicionar a tua lógica
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return String.format("Nome completo: %s\tTelefone: %s\tEndereço: %s",this.nomeCompleto,this.telefone,this.endereco.toString());
	}
}
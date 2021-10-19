package sistemaBancario;

public class DadosConta {
	
	private String nome;
	private float saldo;

	public DadosConta(String nome, float saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public DadosConta(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public float getSaldo() {
		return saldo;
	}

}
package lojavarejo;

public class Loja {

	public static void main(String[] args) {
		
		Clientes cli1 = new Clientes();
		Produtos prod1 = new Produtos();
		Transportadora trans1 = new Transportadora();
		Vendedores vend1 = new Vendedores();
		
		cli1.nome = "Joao";
		cli1.endereco = "Rua dos Bobos";
		cli1.cpf = "0000";
		
		prod1.nome = "Computador";
		prod1.tamanho = "medio";
		prod1.valor = "1000";
		
		trans1.empresa = "Digimer";
		trans1.endereço = "Avenida Assis Brasil 4090";
		trans1.veiculo = "Van";
		
		vend1.idVendedor = "0000000000";
		vend1.nome = "Thiago";
		vend1.comissao = "150";
		
		System.out.printf("O cliente %s comprou o produto %s vendido pelo colaborador %s, que chegará através da transportadora %s", cli1.nome, prod1.nome, vend1.nome, trans1.empresa);

		
	}

}

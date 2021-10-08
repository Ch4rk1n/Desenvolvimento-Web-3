package if_else;
import java.util.Scanner;

public class posto {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
	
		System.out.println("Digite quantos litros deseja comprar");
		double qtd = tec.nextDouble();
	
		System.out.println("Qual Combustivel: A - álcool ou G Gasolina ");
		String combustivel = tec.next();
	
		double gas = 2.5;
		double alc = 1.9;
	
		double desconto = 0;
		double tot = 0;
		double totDesc = 0;
	
		if (combustivel.equalsIgnoreCase("a")) {
			if (qtd > 20) {
				desconto = 0.03;
			} else {
				desconto = 0.05;
			}
			tot = qtd * alc;
		} else if (combustivel.equalsIgnoreCase("g")) {
			if (qtd > 20) {
				desconto = 0.04;
			} else {
				desconto = 0.06;
			}
			tot = qtd * gas;
		}
		totDesc = tot * desconto;
		
		double precoFinal = tot - totDesc;
		
		System.out.println("Preço FInal R$ " + precoFinal);
	
	}
}
package Calculo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	Contas contas = new Contas();
	int escolha;
	
do {
	System.out.println("===============Calculadora=de=Física============");
	System.out.println("Escolha uma das opções:");
	System.out.println("0 - Sair");
	System.out.println("1 - Força peso");
	System.out.println("2 - Força centrípeta");
	System.out.println("3 - Impulso");
	System.out.println("4 - Força elástica");
	System.out.println("5 - Velocidade média");
	System.out.println("6 - Movimento retilíneo uniforme (MRU)");
	System.out.println("7 - Movimento retilíneo uniforme variado (MRUV)");
	System.out.println("===============================================");
	escolha = tec.nextInt();
	switch(escolha) 
	{
	case 1:
		System.out.println(contas.calcularForcaPeso());
		break;
	case 2:
		System.out.println(contas.calcularForcaCentripeta());
		break;
	case 3:
		System.out.println(contas.calcularImpulso());
		break;
	case 4:
		System.out.println(contas.calcularForcaElastica());
		break;
	case 5:
		System.out.println(contas.calcularVelocidadeMedia());
		break;
	case 6:
		System.out.println(contas.calcularMRU());
		break;
	case 7:
		System.out.println(contas.calcularMRUV());
		break;
	default:
		System.err.println("Essa opção é inválida! escolha outra.");
	} 
} while (escolha != 0);
	}
}

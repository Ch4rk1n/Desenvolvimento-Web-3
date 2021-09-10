package Calculo;

import java.util.Scanner;

public class Contas {
	
Scanner tec = new Scanner(System.in);

public double calcularForcaPeso()
{
	double massa, gravidade, resultado;
	System.out.println("Digite a massa do objeto/corpo:");
	massa = tec.nextDouble();
	System.out.println("Digite a aceleração da gravidade:");
	gravidade = tec.nextDouble();
	System.out.println("O resultado é: "); return resultado = massa * gravidade;
	}

public double calcularForcaCentripeta() 
{
	double massa, velocidade, raio, resultado;
	System.out.println("Digite a massa do objeto/corpo:");
	massa = tec.nextDouble();
	System.out.println("Digite a velocidade do objeto/corpo:");
	velocidade = tec.nextDouble();
	System.out.println("Digite o raio da curva:");
	raio = tec.nextDouble();
	System.out.println("O resultado é:"); return resultado = massa * ((velocidade*velocidade) / raio);
}

public double calcularImpulso() 
{
	double forca, intervaloTempo, tempoInicial, tempoFinal, resultado;
	System.out.println("Digite a força exercida sobre o objeto/corpo:");
	forca = tec.nextDouble();
	System.out.println("Digite o tempo inicial da interação:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final da interação:");
	tempoFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	System.out.println("O resultado é: "); return resultado = forca * intervaloTempo;
}

public double calcularForcaElastica()
{
	double forca,constanteElastica, deformacao;
	System.out.println("Digite a constante elástica do corpo:");
	constanteElastica = tec.nextDouble();
	System.out.println("Digite a deformação do objeto:");
	deformacao = tec.nextDouble();
	System.out.println("A força aplicada sobre o objeto é: "); return forca = deformacao * constanteElastica;
}

public double calcularVelocidadeMedia() 
{
	double tempoInicial, tempoFinal, posicaoInicial, posicaoFinal, intervaloTempo, intervaloPosicao, velocidadeMedia;
	System.out.println("Digite o tempo inicial:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final:");
	tempoFinal = tec.nextDouble();
	System.out.println("Digite a posição inicial:");
	posicaoInicial = tec.nextDouble();
	System.out.println("Digite a posição final:");
	posicaoFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	intervaloPosicao = posicaoFinal - posicaoInicial;
	System.out.println("A velocidade média é: "); return velocidadeMedia = intervaloPosicao / intervaloTempo;
}

public double calcularMRU() {
	double tempoInicial, tempoFinal, posicaoInicial, posicaoFinal, intervaloTempo, intervaloPosicao, velocidadeMedia;
	System.out.println("Digite o tempo inicial:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final:");
	tempoFinal = tec.nextDouble();
	System.out.println("Digite a posição inicial do percurso:");
	posicaoInicial = tec.nextDouble();
	System.out.println("Digite a posição final do percurso:");
	posicaoFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	intervaloPosicao = posicaoFinal - posicaoInicial;
	System.out.println("A velocidade média é: "); return velocidadeMedia = intervaloPosicao / intervaloTempo;
}

public double calcularMRUV() {
	double tempoInicial, tempoFinal, velocidadeInicial, velocidadeFinal, intervaloTempo, intervaloVelocidade, aceleracaoMedia;
	System.out.println("Digite o tempo inicial:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final:");
	tempoFinal = tec.nextDouble();
	System.out.println("Digite a velocidade inicial:");
	velocidadeInicial = tec.nextDouble();
	System.out.println("Digite a velocidade final:");
	velocidadeFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	intervaloVelocidade = velocidadeFinal - velocidadeInicial;
	System.out.println("A Aceleração média é: "); return aceleracaoMedia = intervaloVelocidade / intervaloTempo;
}
}

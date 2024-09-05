package controller;

public class ThreadCorrida extends Thread{

	private int distanciaMaxima;
	private int tamanhoMaximo;
	private int numeroSapo;
	
	public ThreadCorrida(int distanciaMaxima, int tamanhoMaximo, int numeroSapo) {
		this.distanciaMaxima = distanciaMaxima;
		this.tamanhoMaximo = tamanhoMaximo;
		this.numeroSapo = numeroSapo;
	}
	
	@Override
	public void run() {
		sapo();
	}
	
	public void sapo() {
		int posicaoAtual = 0;
		int tamanhoPulo = 0;
		while(posicaoAtual < distanciaMaxima) {
			tamanhoPulo = (int)(Math.random()*tamanhoMaximo);
			posicaoAtual += tamanhoPulo;
			System.out.println("Sapo n°" + numeroSapo + " deu um pulo de " + tamanhoPulo + " metros");
		}
		System.out.println("Sapo n°" + numeroSapo + " cruza a linha de chegada!!");
	}
	
}

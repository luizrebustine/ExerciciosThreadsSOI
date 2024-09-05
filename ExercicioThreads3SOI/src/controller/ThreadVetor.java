package controller;

public class ThreadVetor extends Thread{
	
	private int vetor[];
	private int num;
	
	public ThreadVetor(int vetor[], int num) {
		this.vetor = vetor;
		this.num = num;
	}
	
	@Override
	public void run() {
		calculaTempo();
	}
	
	public void calculaTempo() {
		if(num%2==0) {
			double tempoInicial = System.nanoTime();
			for(int i=0;i<vetor.length;i++) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Tempo total usando o for: " + tempoTotal);
		}
		else {
			double tempoInicial = System.nanoTime();
			for(int numero: vetor) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Tempo total usando o for each: " + tempoTotal);
		}
	}
}

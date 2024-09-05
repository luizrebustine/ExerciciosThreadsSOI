package controller;

public class ThreadController extends Thread {

    private int vetor[];
    private int linha;

    public ThreadController(int vetor[], int linha) {
        this.vetor = vetor;
        this.linha = linha;
    }

    @Override
    public void run() {
        calculaLinha();
    }

    private void calculaLinha() {
        int res = 0;
        for (int i = 0; i < vetor.length; i++) {
            res += vetor[i];
        }
        System.out.println("Resultado da linha " + linha + ": " + res);
    }
}

package view;

import controller.MatrizController;
import controller.ThreadController;

public class Main {

	public static void main(String[] args) {
		MatrizController mc = new MatrizController();
		int matrizAleatoria[][] = new int[3][5];
		matrizAleatoria = mc.randomizeMatriz(matrizAleatoria);
		//mc.showMatriz(matrizAleatoria);
		for(int x=0;x<3;x++) {
			int vetorLinha[] = new int[5];
			for(int y=0;y<5;y++) {
				vetorLinha[y] = matrizAleatoria[x][y];
			}
			//mc.showVetor(vetorLinha);
			ThreadController t = new ThreadController(vetorLinha,x);
			t.start();
		}
	}

}

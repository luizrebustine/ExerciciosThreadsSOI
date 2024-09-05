package controller;

public class MatrizController {
	
	public MatrizController() {
		super();
	}
	
	public int[][] randomizeMatriz(int matriz[][]){
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j] = (int)(Math.random()*100);
			}
		}
		return matriz;
	}
	/*public void showMatriz(int matriz[][]){
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				 System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}
	}*/
	/*public void showVetor(int vetor[]){
		for(int j=0;j<5;j++) {
			 System.out.print("["+vetor[j]+"]");
		}
	}*/
}

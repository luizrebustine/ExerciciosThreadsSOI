package view;
import controller.ThreadCorrida; 
public class Main {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Thread t = new ThreadCorrida(100, 3, i+1);
			t.start();
		}
	}

}

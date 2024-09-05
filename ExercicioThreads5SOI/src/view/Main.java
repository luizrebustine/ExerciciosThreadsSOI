package view;

import controller.ThreadPing;

public class Main {

	public static void main(String[] args) {
		String[] servidores = {"Uol", "Terra", "Google"};
		for(String palavra : servidores) {
			Thread t = new ThreadPing(palavra);
			t.start();
		}
	}

}

package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadPing extends Thread{

	private String servidor;
	
	public ThreadPing(String servidor) {
		this.servidor = servidor;
	}
	
	@Override
	public void run() {
		verificaPing();
	}
	
	public void verificaPing() {
		String procArr[] = ("ping -4 -c 10 www."+ servidor.toLowerCase() +".com.br").split(" ");
		try {
			Process p = Runtime.getRuntime().exec(procArr);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine().toString();
			while(linha!=null) {
				if(linha.contains("time=")) {
					String linhaArr[] = linha.split(" ");
					System.out.println(servidor.toUpperCase() + " " + linhaArr[linhaArr.length-2]);
				}
				if(linha.contains("avg")) {
					String linhaArr[] = linha.split("/");
					System.out.println("Média " + servidor.toUpperCase() + ": " + linhaArr[4]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

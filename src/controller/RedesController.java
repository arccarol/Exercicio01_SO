package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	
	public RedesController() {
		super();
	}
	// Nome do sistema operacional
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void readProcess() {
		if(os().contains("Windows")) {
		try {
			Process p = Runtime.getRuntime().exec("IPCONFIG");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if(linha.contains("Adaptador") || linha.contains("adapter")) {
				System.out.println(linha);
				}
				if(linha.contains("IPv4")) {
					System.out.println(linha);
					}
				
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	} else {
		if(os().contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec("IFCONFIG");
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					if(linha.contains("flags")) {
					System.out.println(linha);}
					if(linha.contains("IPv4")) {
						System.out.println(linha);}
					
					linha = buffer.readLine();
				}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			}catch (IOException e) {
				e.printStackTrace();
				
			}
		
	}
	}
	}
	
	public void readping() {
		if(os().contains("Windows")) {
		try {
			Process p = Runtime.getRuntime().exec("PING -4 -n 10 www.google.com.br");
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	} else {
		if(os().contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec("PING -4 -c 10 www.google.com.br");
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
						System.out.println(linha);
					linha = buffer.readLine();
				}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			}catch (IOException e) {
				e.printStackTrace();
				
			}
		
	}
	}
	}
	
	
}

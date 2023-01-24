package br.com.castelo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com Arquivo
		
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		FileOutputStream fos = new FileOutputStream("lorem.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.newLine();
		bw.write("Bruce Wayne");
		bw.newLine();
		bw.write("Clark Kent");
		bw.newLine();
		bw.write("Peter Parker");
		bw.newLine();
		bw.write("Gerald de Rivia");
		bw.newLine();
						
		while(linha != null && !linha.isEmpty()) {
			System.out.println(linha);
			linha = br.readLine();
			
		}
		br.close();
	}

}

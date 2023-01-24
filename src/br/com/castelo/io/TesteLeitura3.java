package br.com.castelo.io;

import java.io.FileWriter;
import java.io.IOException;

public class TesteLeitura3 {

	public static void main(String[] args) throws IOException {

		
//		FileOutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		fw.write("Texto novo aqui parceiro");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("Textinho continua aqui");
		
		fw.close();
			
		
		
		
	}

}

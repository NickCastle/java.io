package br.com.castelo.io;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteLeitura4 {

	public static void main(String[] args) throws IOException {

		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		fw.write("Texto novo aqui parceiro");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("Textinho continua aqui");
		
//		PrintStream ps = new PrintStream("lorem2.txt");
//		ps.println("new text");
//		ps.println();
//		ps.println();
//		ps.println("next line text");
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		pw.println("text here");
		pw.println();
		pw.println();
		pw.println("next line text");
		pw.close();
			
		
		
		
	}

}

package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de Entrada com Arquivos
		
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("texto2.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
		bw.write("Lorem ipsum dolor sit amet");
		bw.newLine();
		bw.newLine();
		bw.write("asdfgasdfgasdfg asd asd asd asdfg");
		
		bw.close();
		
	}

}

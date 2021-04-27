package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Fluxo de Entrada com Arquivos
		
		OutputStream fos = new FileOutputStream("texto2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet");
		bw.newLine();
		bw.newLine();
		bw.write("asdfgasdfgasdfg asd asd asd asdfg");
		
		bw.close();
		
	}

}

package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de Entrada com Arquivos
		
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("texto2.txt");
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
		
		
		PrintStream ps = new PrintStream("texto2.txt");
		
		ps.println("Lorem ipsum dolor sit amet");
		ps.println();
		ps.println("asdfgasdfgasdfg asd asd asd asdfgfffffffffffffffffffff");
		
		
		ps.close();
		
	}

}

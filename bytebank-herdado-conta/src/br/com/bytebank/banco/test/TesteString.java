package br.com.bytebank.banco.test;

public class TesteString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		
		
		String novoAlura = nome.trim();
		System.out.println(novoAlura.charAt(1));
		
		
		
		//String outro = new String("Alura");
		
		//String outra = nome.replace("A", "a");
		
		String outra = nome.toUpperCase();
		
		System.out.println(outra);
	}
}

package br.com.alura.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nico Steppat");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("234113131");
	
		
		
		
		
//		ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getCpf());
	}
}

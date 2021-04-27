package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente cc = new ContaCorrente(22, 11);
		lista.add(cc);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		ContaCorrente cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe: " + existe);

		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já tenho essa conta!");
			}
			
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

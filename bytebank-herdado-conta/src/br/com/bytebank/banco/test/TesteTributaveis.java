package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadoraDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
	
		br.com.bytebank.banco.modelo.ContaCorrente cc = new ContaCorrente(222,333); 
			cc.deposita(100);
			
			SeguroDeVida seguro = new SeguroDeVida();
			
			CalculadoraDeImposto c = new CalculadoraDeImposto();
			c.registra(cc);
			c.registra(seguro);
			
			System.out.println(c.getTotalImposto());
			}
	}



package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalculadoraDeImpostos => FQN
public class CalculadoraDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}

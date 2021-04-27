package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = (contaDaMarcela.transfere(300, contaDoPaulo));
		if (sucessoTransferencia) {
			System.out.println("Transfer�ncia realizada com sucesso!");
		} else {
			System.out.println("Saldo Insufuciente");
		}
		
		System.out.println("Saldo conta da Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo conta do Paulo: " + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "paulo silveira";
		System.err.println(contaDoPaulo.titular);

	}
}

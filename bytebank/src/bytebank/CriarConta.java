package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		System.out.println("segunda conta tem: " + segundaConta.saldo);
		
		System.out.println("primeira conta ag�ncia:  " + primeiraConta.agencia);
		System.out.println("primeira conta numero: " + primeiraConta.numero);
		
		System.out.println("segunda conta ag�ncia: " + segundaConta.agencia);
		
		segundaConta.agencia = 146;
		
		System.out.println("Agora a sgunda conta conta est� na ag�ncia 146");




	}
}

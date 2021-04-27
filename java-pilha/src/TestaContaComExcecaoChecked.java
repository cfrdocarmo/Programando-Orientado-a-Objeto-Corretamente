
public class TestaContaComExcecaoChecked {

	public TestaContaComExcecaoChecked() {
		
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento....");
			ex.printStackTrace();
		}
		
	}

}

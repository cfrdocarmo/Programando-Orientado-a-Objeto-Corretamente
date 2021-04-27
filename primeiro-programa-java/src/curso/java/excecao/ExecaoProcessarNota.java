package curso.java.excecao;

public class ExecaoProcessarNota extends Exception {
	
	public ExecaoProcessarNota(String erro) {
		super("Vixe um erro no Processamento das notas do aluno " + erro);
	}

}

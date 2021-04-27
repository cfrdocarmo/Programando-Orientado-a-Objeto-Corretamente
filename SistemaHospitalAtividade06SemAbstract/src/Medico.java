
public class Medico extends Pessoa {

	
	private String CRM;
	private double salario;
	private String especializacao;
	
	public Medico(String nome, String endereco, int idade, String cPF, String sexo) {
		super(nome, endereco, idade, cPF, sexo);
	}
	
	public void platao() {
		
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", salario=" + salario + ", especializacao=" + especializacao + "]";
	}
	
	
	@Override
	public String imprimirValores() {
		return super.imprimirValores();
	}
	
	
	
}

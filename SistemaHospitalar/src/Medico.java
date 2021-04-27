
public class Medico extends Pessoa {

	private String CRM;
	private double salario;
	private String especializacao;
	
	public void platao() {
		
	}
	
	public Medico() {
		
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
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

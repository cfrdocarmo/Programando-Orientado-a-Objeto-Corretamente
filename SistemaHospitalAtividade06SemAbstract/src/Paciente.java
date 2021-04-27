
public class Paciente extends Pessoa{

	
	private String doença;
	private String medicacao;
	
	
	public Paciente(String nome, String endereco, int idade, String cPF, String sexo) {
		super(nome, endereco, idade, cPF, sexo);
	}
	
	public void dor() {

	}

	public void altaHospitalar() {

	}

	public String getDoença() {
		return doença;
	}

	public void setDoença(String doença) {
		this.doença = doença;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

	@Override
	public String toString() {
		return "Paciente [doença=" + doença + ", medicacao=" + medicacao + "]";
	}
	
	
	@Override
	public String imprimirValores() {
		return super.imprimirValores();
	}
	
	
	
}

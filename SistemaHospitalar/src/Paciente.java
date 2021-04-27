
public class Paciente extends Pessoa {

	private String doença;
	private String medicacao;

	public void dor() {

	}

	public void altaHospitalar() {

	}

	public Paciente() {
		super();
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
		return "Paciente [doença=" + doença + ", medicacao=" + medicacao + ", nome=" + nome + "]";
	}

	@Override
	public String imprimirValores() {

		return this.toString();
	}

}

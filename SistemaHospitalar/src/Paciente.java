
public class Paciente extends Pessoa {

	private String doen�a;
	private String medicacao;

	public void dor() {

	}

	public void altaHospitalar() {

	}

	public Paciente() {
		super();
	}

	public String getDoen�a() {
		return doen�a;
	}

	public void setDoen�a(String doen�a) {
		this.doen�a = doen�a;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

	

	@Override
	public String toString() {
		return "Paciente [doen�a=" + doen�a + ", medicacao=" + medicacao + ", nome=" + nome + "]";
	}

	@Override
	public String imprimirValores() {

		return this.toString();
	}

}

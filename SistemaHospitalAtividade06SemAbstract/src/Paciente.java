
public class Paciente extends Pessoa{

	
	private String doen�a;
	private String medicacao;
	
	
	public Paciente(String nome, String endereco, int idade, String cPF, String sexo) {
		super(nome, endereco, idade, cPF, sexo);
	}
	
	public void dor() {

	}

	public void altaHospitalar() {

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
		return "Paciente [doen�a=" + doen�a + ", medicacao=" + medicacao + "]";
	}
	
	
	@Override
	public String imprimirValores() {
		return super.imprimirValores();
	}
	
	
	
}

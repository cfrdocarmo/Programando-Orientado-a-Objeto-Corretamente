
public class Pessoa {

	
	private String nome;
	private String endereco;
	private int idade;
	private String CPF;
	private String sexo;
	
	
	public Pessoa(String nome, String endereco, int idade, String cPF, String sexo) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		CPF = cPF;
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", CPF=" + CPF + ", sexo="
				+ sexo + "]";
	}
	
	public void andar() {
		
	}
	
	public String imprimirValores() {
		return this.toString();
	}
	
	
	
	
	
}

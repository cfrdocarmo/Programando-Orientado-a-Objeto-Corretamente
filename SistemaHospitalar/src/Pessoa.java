
/*Herança = Classe Pai ou classe master ou superClasse -(Atributos comum a todos os objetos filhos)*/
public abstract class Pessoa {

	protected String nome;
	protected String endereco;
	protected int idade;
	protected String CPF;
	protected String sexo;
	
	public abstract String imprimirValores();
	
	
	public void andar() {
		
	}
	
	public Pessoa() {
		
	}

	
	public Pessoa(String nome, String endereco, int idade, String cPF, String sexo) {
		super();
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

	
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", CPF=" + CPF + ", sexo="
				+ sexo + "]";
	}

	
		
	

	
	
}

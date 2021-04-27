package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("2121dvxc");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("1515415616515");
		secretario.setIdade(18);;
		secretario.setNome("João");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário = " + aluno.salario() );
		System.out.println("Salario Diretor é = " + diretor.salario());
		System.out.println("Slario Secretário é = " + secretario.salario());
		
	
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais " + pessoa.getNome() + " e o salario é de = " + pessoa.salario());
	}
	
	
}

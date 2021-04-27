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
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("1515415616515");
		secretario.setIdade(18);;
		secretario.setNome("Jo�o");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio = " + aluno.salario() );
		System.out.println("Salario Diretor � = " + diretor.salario());
		System.out.println("Slario Secret�rio � = " + secretario.salario());
		
	
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais " + pessoa.getNome() + " e o salario � de = " + pessoa.salario());
	}
	
	
}

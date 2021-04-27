package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	
	/* Main � um m�todo auto executavel em Java */
	public static void main(String[] args) {
		
		try {
			
		//lerArquivo();
		
		String login = JOptionPane.showInputDialog("Informe o Login: ");
		String senha = JOptionPane.showInputDialog("Informe o senha: ");
		
		
		
		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {   /*Vou travar o contrato para autorizar somente quem raelmente tem o contrato 100% Legitimo*/

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*� uma lista que dentro dela temos uma nova chave que identifica uma sequencia de valores tamb�m*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		for(int qtd = 2; qtd <= 1; qtd++) {
		
		/* new Aluno() � uma instancia (cria��o de um objeto) */
		/* aluno1 � uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		/*
		String dataNascimento = JOptionPane.showInputDialog("Qual a Data de Nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o registro geral?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matr�cula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a s�rie est� matriculado?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");*/

			
		Aluno aluno1 = new Aluno();

		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		/*
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);*/

		for(int pos = 1; pos <= 1; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina" + pos + " ?" );
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + " ?" );
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			//disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina?");
		
		if(escolha == 0) {
			
			int continuarRemover = 0;   /*Op��o sim e Zero*/
			int posicao = 1;
			
			while (continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3, 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
		  
			}
		}
		
		alunos.add(aluno1);
	  }
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) { /*Separei em Listas*/
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("------------------------Lista dos Aprovados------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + " com m�dia de = " + aluno.getMediaNota());
			
		}
		
		
		System.out.println("------------------------Lista dos Reprovados------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getNome() + " com m�dia de = " + aluno.getMediaNota());
			
		}
		
		
		System.out.println("------------------------Lista dos Recupera��o------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getNome() + " com m�dia de = " + aluno.getMediaNota());
			
		}
		
	}else {
		JOptionPane.showMessageDialog(null, "Acesso n�o Permitido");
	}
		
		
		
		
		
		/*Aqui*/
		
		}catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			/*Imprime Erro non console Java*/
			e.printStackTrace();  
			
			/*Mensagem do Erro ou Causa*/
			System.out.println(" Mensagem " + e.getMessage());
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n M�todo de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class de erro: " + e.getClass().getName());
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro de convers�o de N�mero" + saida.toString());
		
		
		}finally { /*Sempre � executado ocorrendo ou n�o*/
			/*finnaly sempre � usado quando precisa executar um processo acontecendo erro ou n�o no sistema*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
		}
		
		
	}
	
	/*public static void lerArquivo() throws FileNotFoundException {
		
		
		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);
	}*/
	
}

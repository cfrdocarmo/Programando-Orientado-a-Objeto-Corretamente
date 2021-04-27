package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
	double[] notas = {8.8, 9.7, 7.6, 6.8};	
	double[] notasLogica = {7.1, 5.7, 9.6, 7.8};
		
	
	/*Cria��o do Aluno*/	
	Aluno aluno = new Aluno();
	aluno.setNome("Alex Egidio ");
	aluno.setNomeEscola(" JDEV Treinamentos");
	
	
	/*Cria��o da Disciplina*/
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Curso Java");
	disciplina.setNota(notas);
	
	aluno.getDisciplinas().add(disciplina);	
	
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("L�gica de Programa��o");
	disciplina2.setNota(notasLogica);
	
	aluno.getDisciplinas().add(disciplina2);
	
	
	/*Cria��o do Aluno*/	
	Aluno aluno2 = new Aluno();
	aluno2.setNome("Alex Egidio ");
	aluno2.setNomeEscola(" JDEV Treinamentos");
	
	
	/*Cria��o da Disciplina*/
	Disciplina disciplina3 = new Disciplina();
	disciplina3.setDisciplina("Curso Java");
	disciplina3.setNota(notas);
	
	aluno2.getDisciplinas().add(disciplina3);	
	
	
	Disciplina disciplina4 = new Disciplina();
	disciplina4.setDisciplina("L�gica de Programa��o");
	disciplina4.setNota(notasLogica);
	
	aluno2.getDisciplinas().add(disciplina4);
	//-------------------------------------------------------------------------------------------
	
	Aluno[] arrayAlunos = new Aluno[2];
	
	arrayAlunos[0] = aluno;
	arrayAlunos[1] = aluno2;
	
	for (int pos = 0; pos < arrayAlunos.length; pos++) {
		
		System.out.println("Nome do Aluno �: " + arrayAlunos[pos].getNome());
		
		for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da Disciplina �: " + d.getDisciplina());
			
			for (int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("A Nota n�mero " + posnota + " � igual = " + d.getNota()[posnota]);
			}
		}
		
		
	}
	
	
	
	}
}

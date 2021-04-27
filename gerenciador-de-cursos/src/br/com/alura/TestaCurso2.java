package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Curso javaColocoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColocoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColocoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColocoes.adiciona(new Aula("Modelando comccoleções", 24));

		List<Aula> aulasImutaveis = javaColocoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColocoes.getTempoTotal());
		
		
		System.out.println(javaColocoes);
		
		
		
	}

}

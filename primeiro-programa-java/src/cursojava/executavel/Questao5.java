package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		
		List<Nomes> nomes = new ArrayList<Nomes>();
		
		for (int i = 0; i < 5; i++) {
			String[] nome = null;
			nome[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + "[i]" + "º: " );
		}
	
	
}
}
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		List <Hospital> hospitals1 = new ArrayList<Hospital>();
		List <Paciente> pacientes1 = new ArrayList<Paciente>();
		List <Medico> medicos1 = new ArrayList<Medico>();
		
		int key;
		do {
			
			key = Integer.valueOf(JOptionPane.showInputDialog("          										 \r\n"
													+ "       |-------------------------------------------------|  \r\n"
													+ "		       |              Sistema Hospitalar               |  \r\n"
													+ "       |-------------------------------------------------| \r\n"
													+ "	       |        1   - Cadastrar Hospital   		           | \r\n"
													+ "       |-------------------------------------------------|  \r\n"
													+ "		       |         2   - Cadastrar Paciente  		          		| \r\n"
													+ "       |-------------------------------------------------|  \r\n"
													+ "		       |         3   - Cadastrar Medico   		            		| \r\n"
													+ "       |-------------------------------------------------|  \r\n"
													+ "		       |         4   -   Imprimir Pacientes    	       		| \r\n"
													+ "       |-------------------------------------------------|  \r\n"
													
													+ "		     												  "));
			
			
			switch (key) {
			case 1: 
					List <Hospital> hospitals = new ArrayList<Hospital>();
				
					Hospital hospital = new Hospital();
					hospital.setNome(JOptionPane.showInputDialog("Digite o nome do Hospital: "));
					hospital.setEndereco(JOptionPane.showInputDialog("Digite o endereço do Hospital: "));
					hospitals.add(hospital);
					hospitals1.add(hospital);
					break;
					//
			
			case 2: 
				
					List <Paciente> pacientes = new ArrayList<Paciente>();
				
					Paciente paciente1 = new Paciente(null, null, key, null, null);
					
					paciente1.setNome(JOptionPane.showInputDialog("Digite o nome do Paciente"));
					paciente1.setEndereco(JOptionPane.showInputDialog("Digite o Endereço do Paciente: "));
					paciente1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a Idade do Paciente")));
					paciente1.setCPF(JOptionPane.showInputDialog("Digite o CPF do Paciente"));
					paciente1.setSexo(JOptionPane.showInputDialog("Digite o Sexo do Paciente"));
					pacientes.add(paciente1);
					pacientes1.add(paciente1);
					
					/*
					for (Paciente paciente : pacientes) {
						System.out.println(pacientes);
					}*/
					
					paciente1.imprimirValores();
					
					break;
					
			case 3:
					
					List <Medico> medicos = new ArrayList<Medico>();
					
					Medico medico1 = new Medico(null, null, key, null, null);
					
					medico1.setCRM(JOptionPane.showInputDialog("Digite o CRM do Médico: "));
					medico1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Sálario do Médico: ")));
					medico1.setEspecializacao(JOptionPane.showInputDialog("Digite a Especialização do Médico: "));
					medicos.add(medico1);
					medicos1.add(medico1);
			
			case 4:
					for (Paciente paciente : pacientes1) {
						System.out.println(paciente);
					}
			case 5:
					for (Medico medico : medicos1) {
						System.out.println(medico);
					}
			case 6:
					for (Hospital hospital2 : hospitals1) {
						System.out.println(hospital2);
					}
					
					
			
			}
			
			
			
			
			
		}while(key < 5);
		
		
		
	
		}
		

	
}

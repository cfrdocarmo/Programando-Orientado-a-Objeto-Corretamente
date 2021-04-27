package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());  /*Painel de Componentes*/
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Gerar Lote");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	

	
	
	
	
	public TelaTimeThread() {  /*Executa o que estiver dentro no momento da abertura ou execução*/
		
		setTitle("Minha Tela de Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira Parte Concluída*/
		
		
		GridBagConstraints gridBagConstaBagConstraints = new GridBagConstraints(); /*controlador de Posicionamento de Componentes*/
		gridBagConstaBagConstraints.gridx = 0;
		gridBagConstaBagConstraints.gridy = 0;
		gridBagConstaBagConstraints.gridwidth = 2;
		gridBagConstaBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstaBagConstraints.anchor = gridBagConstaBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstaBagConstraints);
		
		mostraTempo.setPreferredSize(new DimensionUIResource(200, 25));
		gridBagConstaBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstaBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstaBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstaBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstaBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstaBagConstraints);
		
		//*********************************************************
		gridBagConstaBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstaBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstaBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstaBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstaBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { /*Executa o Click no Botão*/
				
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qtd = 0; qtd < 100; qtd++) {  /*simuando 100 envios em massa*/
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo.getText() + " - " + qtd);
				
				fila.add(filaThread);
				
				}
				
			}
		} );
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila = null;
				
			}
		});
		
		
		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		/*Sempre será o último comando*/
		setVisible(true); /*Torna a Tela Visível para o Usuário*/
	}
	
	
}

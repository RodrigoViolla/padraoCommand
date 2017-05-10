import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame {
	// CRIANDO OS COMPONENTES QUE SER�O UTILIZADOS NA JANELA.
	private JLabel rotulo = new JLabel();
	private JButton botao = new JButton("Ok");
	
	// CRIA��O DO PAINEL PARA ORGANIZA��O DOS ITENS NA TELA.
	JPanel painel = new JPanel();
	
	public JanelaPrincipal() {
		// NOME DA JANELA
		super("Meu Janel�o");
		
		// FUN��O PADR�O DO BOT�O SAIR. O BOT�O [X].
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// MEDIDAS DA JANELA CRIADA.
		setBounds(0, 0, 400, 600);
		
		// ADICIONANDO OS ITENS CRIADOS AO PAINEL
		painel.add(rotulo);
		painel.add(botao);
		
		// ADICIONANDO O PAINEL A JANELA
		add(painel);
		
		/* ADICIONANDO AO 'BOTAO' UMA TECLA DE ATALHO A MESMA.
		* 'VK' � REFERENTE A TECLA 'ALT'. NO EXEMPLO A TECLA
		* DE ATALHO � 'ALT + C'.
		*/
		botao.setMnemonic(KeyEvent.VK_C);
		
		// ADICIONANDO UMA A��O AO BOT�O
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 'rootPane' PEGA A JANELA NA QUAL CHAMOU O EVENTO
				// 
				botao.setVisible(false);
			}
		});
		
		// DEIXA A JANELA CRIADA VIS�VEL.
		setVisible(true);
	}
	
	public void setRotulo(String texto) {
		rotulo.setText(texto);
	}
	
	public void setBotao(String texto) {
		botao.setText(texto);
	}
	
	public static void main(String[] args) {
		JanelaPrincipal minhaJanela = new JanelaPrincipal();
		
		String mensagem = JOptionPane.showInputDialog("Digite uma frase: ");
		minhaJanela.setRotulo(mensagem);
	}
}

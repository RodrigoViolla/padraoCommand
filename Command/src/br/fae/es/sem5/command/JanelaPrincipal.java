package br.fae.es.sem5.command;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JanelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
        Controle gerenciar = new Controle();
        
        Dispositivo tv = new Dispositivo("TV");
        Dispositivo radio = new Dispositivo("Radio");
        Dispositivo portaoEletronico = new Dispositivo("Portão Eletrônico");
        Dispositivo arCondicionado = new Dispositivo("Ar Condicionado");

	public JanelaPrincipal() {
		super("Controle Remoto");
		
                /*-----------------------------------------------------------
                CRIAÇÃO DOS COMPONENTES
                -----------------------------------------------------------*/
                JLabel lblTitulo = new JLabel("Controle Remoto");
                JLabel lblResposta = new JLabel("Nenhuma Ação Realizada");
                JLabel lblHistorico = new JLabel("Histórico Vazio");
                
                JLabel lblTv = new JLabel("TV");
                JLabel lblRadio = new JLabel("Radio");
                JLabel lblPortaoEletronico = new JLabel("Port�o Eletronico");
                JLabel lblArCondicionado = new JLabel("Ar Condicionado");
                
                JButton btnLigarTV = new JButton("Ligar");
                JButton btnDesligarTV = new JButton("Desligar");
                JButton btnLigarRadio = new JButton("Ligar");
                JButton btnDesligarRadio = new JButton("Desligar");
                JButton btnLigarPortaoEletronico = new JButton("Ligar");
                JButton btnDesligarPortaoEletronico = new JButton("Desligar");
                JButton btnLigarArCondicionado = new JButton("Ligar");
                JButton btnDesligarArCondicionado = new JButton("Desligar");
                
                
                /*-----------------------------------------------------------
                DEFINIÇÃO DO TAMANHO DOS COMPONENTES
                -----------------------------------------------------------*/
                lblTitulo.setBounds(60, 34, 230, 23);
                lblResposta.setBounds(10, 400, 200, 23);
                lblHistorico.setBounds(10, 420, 420, 23);
                
                lblTv.setBounds(10, 102, 132, 23);
                lblRadio.setBounds(10, 172, 132, 23);
		lblRadio.setBounds(10, 172, 132, 23);
                lblArCondicionado.setBounds(10, 300, 132, 23);
                lblPortaoEletronico.setBounds(10, 237, 132, 23);
               
                btnLigarTV.setBounds(152, 102, 89, 23);
		btnDesligarTV.setBounds(251, 102, 89, 23);
                btnLigarRadio.setBounds(152, 172, 89, 23);
		btnDesligarRadio.setBounds(251, 172, 89, 23);
                btnLigarPortaoEletronico.setBounds(152, 237, 89, 23);
		btnDesligarPortaoEletronico.setBounds(251, 237, 89, 23);
		btnLigarArCondicionado.setBounds(152, 300, 89, 23);
		btnDesligarArCondicionado.setBounds(251, 300, 89, 23);

                
		/*-----------------------------------------------------------
                ADICIONANDO OS COMPONENTES NO JFRAME
                -----------------------------------------------------------*/
		add(lblTitulo);
                add(lblTv);
                add(lblRadio);
                add(lblPortaoEletronico);
                add(lblArCondicionado);
                
                add(lblResposta);
                add(lblHistorico);
                
                add(btnLigarTV);
                add(btnDesligarTV);
                add(btnLigarRadio);
                add(btnDesligarRadio);
                add(btnLigarPortaoEletronico);
                add(btnDesligarPortaoEletronico);
                add(btnLigarArCondicionado);
                add(btnDesligarArCondicionado);
               
                
                /*-----------------------------------------------------------
                ALINHAMENTO DOS COMPONENTES
                -----------------------------------------------------------*/
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblTv.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortaoEletronico.setHorizontalAlignment(SwingConstants.CENTER);
		lblArCondicionado.setHorizontalAlignment(SwingConstants.CENTER);
		
                
                /*-----------------------------------------------------------
                CONFIGURAÇÃO INICIAIS DOS BOTÕES
                -----------------------------------------------------------*/
                btnDesligarTV.setEnabled(false);
                btnDesligarRadio.setEnabled(false);
                btnDesligarPortaoEletronico.setEnabled(false);
                btnDesligarArCondicionado.setEnabled(false);
            
                
                /*-----------------------------------------------------------
                CONFIGURAÇÃO DA JANELA
                -----------------------------------------------------------*/
                setBackground(new Color(169, 169, 169));
		setLayout(null);
                setVisible(true);
                setSize(400,500);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                
                
                /*-----------------------------------------------------------
                FUNÇÕES DOS BOTÕES
                -----------------------------------------------------------*/
                btnLigarTV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarTV.setEnabled(false);
                                btnDesligarTV.setEnabled(true);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoLigar(), tv);
                                lblResposta.setText("TV On");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		}); 
                
                 btnDesligarTV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarTV.setEnabled(true);
                                btnDesligarTV.setEnabled(false);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), tv);
                                lblResposta.setText("TV Off");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
                 
                btnLigarRadio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarRadio.setEnabled(false);
                                btnDesligarRadio.setEnabled(true);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), radio);
                                lblResposta.setText("Radio On");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
                  
                btnDesligarRadio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarRadio.setEnabled(true);
                                btnDesligarRadio.setEnabled(false);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), radio);
                                lblResposta.setText("Radio Off");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
                
                
                btnLigarPortaoEletronico.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarPortaoEletronico.setEnabled(false);
                                btnDesligarPortaoEletronico.setEnabled(true);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), portaoEletronico);
                                lblResposta.setText("Portao Eletronico On");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
                  
                btnDesligarPortaoEletronico.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarPortaoEletronico.setEnabled(true);
                                btnDesligarPortaoEletronico.setEnabled(false);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), portaoEletronico);
                                lblResposta.setText("Portao Eletronico Off");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
                
                btnLigarArCondicionado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarArCondicionado.setEnabled(false);
                                btnDesligarArCondicionado.setEnabled(true);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(),arCondicionado);
                                lblResposta.setText("Ar Condicionado On");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
                  
                btnDesligarArCondicionado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLigarArCondicionado.setEnabled(true);
                                btnDesligarArCondicionado.setEnabled(false);
                                
                                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), arCondicionado);
                                lblResposta.setText("Ar Condicionado Off");
                                lblHistorico.setText(gerenciar.listarHistorico());
			}
		});
	}
	
	public static void main(String[] args) {
            new JanelaPrincipal();
	}
}
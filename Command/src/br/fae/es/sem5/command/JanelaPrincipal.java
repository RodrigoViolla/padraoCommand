package br.fae.es.sem5.command;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
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
        JTextArea txaHistorico = new JTextArea();
                
        JLabel lblTv = new JLabel("TV");
        JLabel lblRadio = new JLabel("Radio");
        JLabel lblPortaoEletronico = new JLabel("Portao Eletronico");
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
        lblResposta.setBounds(10, 320, 200, 23);
        txaHistorico.setBounds(10, 340, 200, 100 );
                
        lblTv.setBounds(10, 100, 132, 23);
        lblRadio.setBounds(10, 160, 132, 23);
        lblPortaoEletronico.setBounds(10, 220, 132, 23);
        lblArCondicionado.setBounds(10, 280, 132, 23);  
               
        btnLigarTV.setBounds(152, 100, 89, 23);
	btnDesligarTV.setBounds(251, 100, 89, 23);
        btnLigarRadio.setBounds(152, 160, 89, 23);
	btnDesligarRadio.setBounds(251, 160, 89, 23);
        btnLigarPortaoEletronico.setBounds(152, 220, 89, 23);
	btnDesligarPortaoEletronico.setBounds(251, 220, 89, 23);
	btnLigarArCondicionado.setBounds(152, 280, 89, 23);
	btnDesligarArCondicionado.setBounds(251, 280, 89, 23);

                
	/*-----------------------------------------------------------
        ADICIONANDO OS COMPONENTES NO JFRAME
        -----------------------------------------------------------*/
	add(lblTitulo);
        add(lblTv);
        add(lblRadio);
        add(lblPortaoEletronico);
        add(lblArCondicionado);
                
        add(lblResposta);
        add(txaHistorico);
                
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
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	}); 
                
        btnDesligarTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		btnLigarTV.setEnabled(true);
                btnDesligarTV.setEnabled(false);
                                
                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), tv);
                lblResposta.setText("TV Off");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	});
                 
        btnLigarRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		btnLigarRadio.setEnabled(false);
                btnDesligarRadio.setEnabled(true);
                                
                gerenciar.ArmazenarEAcionar(new BotaoLigar(), radio);
                lblResposta.setText("Radio On");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	});
                  
        btnDesligarRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLigarRadio.setEnabled(true);
                btnDesligarRadio.setEnabled(false);
                                
                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), radio);
                lblResposta.setText("Radio Off");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	});
                        
        btnLigarPortaoEletronico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLigarPortaoEletronico.setEnabled(false);
                btnDesligarPortaoEletronico.setEnabled(true);
                                
                gerenciar.ArmazenarEAcionar(new BotaoLigar(), portaoEletronico);
                lblResposta.setText("Portao Eletronico On");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	});
                  
        btnDesligarPortaoEletronico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		btnLigarPortaoEletronico.setEnabled(true);
                btnDesligarPortaoEletronico.setEnabled(false);
                                
                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), portaoEletronico);
                lblResposta.setText("Portao Eletronico Off");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	});
                
        btnLigarArCondicionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		btnLigarArCondicionado.setEnabled(false);
                btnDesligarArCondicionado.setEnabled(true);
                                
                gerenciar.ArmazenarEAcionar(new BotaoLigar(),arCondicionado);
                lblResposta.setText("Ar Condicionado On");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
	});
                  
        btnDesligarArCondicionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		btnLigarArCondicionado.setEnabled(true);
                btnDesligarArCondicionado.setEnabled(false);
                                
                gerenciar.ArmazenarEAcionar(new BotaoDesligar(), arCondicionado);
                lblResposta.setText("Ar Condicionado Off");
                txaHistorico.setText(gerenciar.listarHistorico());
            }
        });
    }
	
    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}
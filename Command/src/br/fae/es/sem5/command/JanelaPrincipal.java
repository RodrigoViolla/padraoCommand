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
	private Controle controle = new Controle();
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new JanelaPrincipal();
	}

	public JanelaPrincipal() {
		setBackground(new Color(169, 169, 169));
		setLayout(null);

		JLabel lblTitulo = new JLabel("Controle Remoto");
		lblTitulo.setBounds(60, 34, 230, 23);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 22));
		add(lblTitulo);

		JLabel lblTv = new JLabel("TV");
		lblTv.setBounds(10, 102, 132, 23);
		lblTv.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTv);

		JButton btnLigarTV = new JButton("Ligar");
		btnLigarTV.setBounds(152, 102, 89, 23);
		add(btnLigarTV);

		JButton btnDesligarTV = new JButton("Desligar");
		btnDesligarTV.setBounds(251, 102, 89, 23);
		add(btnDesligarTV);

		JLabel lblRadio = new JLabel("Rádio");
		lblRadio.setBounds(10, 172, 132, 23);
		lblRadio.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblRadio);

		JButton btnLigarRadio = new JButton("Ligar");
		btnLigarRadio.setBounds(152, 172, 89, 23);
		add(btnLigarRadio);

		JButton btnDesligarRadio = new JButton("Desligar");
		btnDesligarRadio.setBounds(251, 172, 89, 23);
		add(btnDesligarRadio);

		JLabel lblPortaoEletronico = new JLabel("Portão Eletrônico");
		lblPortaoEletronico.setBounds(10, 237, 132, 23);
		lblPortaoEletronico.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblPortaoEletronico);

		JButton btnLigarPortaoEletronico = new JButton("Ligar");
		btnLigarPortaoEletronico.setBounds(152, 237, 89, 23);
		add(btnLigarPortaoEletronico);

		JButton btnDesligarPortaoEletronico = new JButton("Desligar");
		btnDesligarPortaoEletronico.setBounds(251, 237, 89, 23);
		add(btnDesligarPortaoEletronico);

		JLabel lblArCondicionado = new JLabel("Ar Condicionado");
		lblArCondicionado.setBounds(10, 300, 132, 23);
		lblArCondicionado.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblArCondicionado);

		JButton btnLigarArCondicionado = new JButton("Ligar");
		btnLigarArCondicionado.setBounds(152, 300, 89, 23);
		add(btnLigarArCondicionado);

		JButton btnDesligarArCondicionado = new JButton("Desligar");
		btnDesligarArCondicionado.setBounds(251, 300, 89, 23);
		add(btnDesligarArCondicionado);

		btnLigarTV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dispositivo tv = new Dispositivo("tv");
				controle.ArmazenarEAcionar(new BotaoLigar(), tv);
			}
		});

	}
}
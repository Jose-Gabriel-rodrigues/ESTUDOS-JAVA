package br.com.cod3r.cal.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Deplay extends JPanel{
	private JLabel  label;
	public Deplay() {
		setBackground(new Color(46, 49, 50));
		 label = new JLabel("1234,55");
		 label.setForeground(Color.WHITE);
		 label.setFont(new Font("courite", Font.PLAIN,30));// aqui ele vair meio que  dizer qual o tamanho do numero do calculor
		 setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		 add(label);
}
}

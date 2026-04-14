package br.com.cod3r.cal.visao;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	public Calculadora() {
		organizarLayout();
		setSize(232, 322);//dimensao da calculadora
		setDefaultCloseOperation(EXIT_ON_CLOSE);// vai deixa fecha o calculadora//
		setLocationRelativeTo(null);// so vai ajudar a abrir no meio da tela //
		setVisible(true);
	}
	
	public void organizarLayout() {
		setLayout(new BorderLayout());
		Deplay deplay = new Deplay();
		deplay.setPreferredSize(new Dimension(233,60));// aqui to meio de dividindo a tela da calculadora da partes de numero  e a de sresultador 
		add(deplay,BorderLayout.NORTH);// parte de cima  da calculadora 
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);// parte de baixo da calculadora 
	}
	
	public static void main(String[] args) {
		new Calculadora() {
		};
	}
}

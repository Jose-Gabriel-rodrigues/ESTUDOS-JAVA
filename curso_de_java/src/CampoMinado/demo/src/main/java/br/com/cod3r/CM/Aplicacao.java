package br.com.cod3r.CM;

import br.com.cod3r.CM.modelo.Tabuleiro;
import br.com.cod3r.CM.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}

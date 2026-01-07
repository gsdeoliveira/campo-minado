package br.com.gsdeoliveira.cm;

import br.com.gsdeoliveira.cm.modelo.Tabuleiro;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 36);
		tabuleiro.marcar(3, 3);
		tabuleiro.abrir(3, 3);
		
		System.out.println(tabuleiro);
	}
}

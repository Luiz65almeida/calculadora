package calculadora;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	
	public Calculadora () {
		
		setSize(232, 322); /* Tamanho da tela*/
		setDefaultCloseOperation(HIDE_ON_CLOSE); /* Faz encerrar o programa ao fechar a tela*/
		setVisible(true); /* Faz aparecer uma tela*/
		
	}
	
	public static void main(String[] args) {
		
		new Calculadora();
		
		
	}

}

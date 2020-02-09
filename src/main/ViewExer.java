package main;

import javax.swing.JOptionPane;
import controller.ExerPalindromo;

public class ViewExer {

	public static void main(String[] args) {

		ExerPalindromo exer = new ExerPalindromo();
		int menu = -1;

		while (menu != 2) {
			if (exer.verificaPalindromo(JOptionPane.showInputDialog("Digite um Palindromo"))) {

				JOptionPane.showMessageDialog(null, "� um Palindromo");
			} else {
				JOptionPane.showMessageDialog(null, "N�o � um Palindromo");
			}

			do {
				try {

					menu = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1 - novo palindromo \n 2 - sair"));

					if (menu <1 || menu > 2) {
						JOptionPane.showMessageDialog(null, "Valor n�o � valido");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Valor n�o � valido");
					menu = -1;
				}

			} while (menu != 1 && menu != 2);

		}
	}

}

package main;

import javax.swing.JOptionPane;
import controller.ExerJava;

public class ViewExer {

	public static void main(String[] args) {

		ExerJava exer = new ExerJava();
		int menu;

		do {

			try {

				menu = Integer.parseInt(
						JOptionPane.showInputDialog("Digite \n 1 - Exer Palindromo "
								+ "\n 2 - Exer Nome"
								+ "\n 3 - Exer URL" 
								+ "\n 9 - Sair"));

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor n�o � valido");
				menu = -1;
			}

			switch (menu) {
			case 1:
				if (exer.verificaPalindromo(JOptionPane.showInputDialog("Digite um Palindromo"))) {

					JOptionPane.showMessageDialog(null, "� um Palindromo");
				} else {
					JOptionPane.showMessageDialog(null, "N�o � um Palindromo");
				}

				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						exer.separaNome(JOptionPane.showInputDialog("Digite o seu nome completo")));
				break;
			case 3:
				JOptionPane.showMessageDialog(null,
						exer.verificaURL(JOptionPane.showInputDialog("Digite a url")));
				
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando Aplica��o");
				break;

			case -1:

				break;

			default:

				JOptionPane.showMessageDialog(null, "Op��o invalida");

				break;
			}

		} while (menu != 9);

	}
}

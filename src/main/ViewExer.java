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
				JOptionPane.showMessageDialog(null, "Valor não é valido");
				menu = -1;
			}

			switch (menu) {
			case 1:
				if (exer.verificaPalindromo(JOptionPane.showInputDialog("Digite um Palindromo"))) {

					JOptionPane.showMessageDialog(null, "é um Palindromo");
				} else {
					JOptionPane.showMessageDialog(null, "Não é um Palindromo");
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
				JOptionPane.showMessageDialog(null, "Finalizando Aplicação");
				break;

			case -1:

				break;

			default:

				JOptionPane.showMessageDialog(null, "Opção invalida");

				break;
			}

		} while (menu != 9);

	}
}

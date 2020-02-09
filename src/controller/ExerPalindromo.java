package controller;

public class ExerPalindromo {

	public boolean verificaPalindromo(String texto) {
		
		// retira os espaços da string
		texto = texto.replaceAll(" ", "");

		// coloca a string em um vetor de char
		char[] vetor = texto.toCharArray();

		int length = vetor.length;

		for (int i = 0; i < length; i++, length--) {

			if (vetor[i] != vetor[length - 1]) {

				return false;
			}

		}

		return true;
	}

}

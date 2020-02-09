package controller;

import javafx.beans.binding.StringBinding;

/*
 * Fazer uma classe que leia um String, coloque num char array, 
 * verifique se o String de entrada � um pal�ndromo e 
 * mostre na sa�da uma mensagem dizendo se � ou n�o um pal�ndromo, 
 * a palavra de entrada e o vetor de verifica��o do pal�ndromo.
 * 
 */

public class ExerJava {

	public boolean verificaPalindromo(String texto) {

		// retira os espa�os da string
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

	/*
	 * Utilizando o m�todo Split, fa�a uma classe que leia um String que contenha o
	 * nome de uma pessoa e imprima cada nome dele separado.
	 */

	public String separaNome(String texto) {

		StringBuilder sb = new StringBuilder();

		String[] palavras = texto.split(" ");

		for (String palavra : palavras) {

			sb.append(palavra).append('\n');

		}

		return sb.toString();

	}

}

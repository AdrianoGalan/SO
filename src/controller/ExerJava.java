package controller;

import javafx.beans.binding.StringBinding;

/*
 * Fazer uma classe que leia um String, coloque num char array, 
 * verifique se o String de entrada é um palíndromo e 
 * mostre na saída uma mensagem dizendo se é ou não um palíndromo, 
 * a palavra de entrada e o vetor de verificação do palíndromo.
 * 
 */

public class ExerJava {

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

	/*
	 * Utilizando o método Split, faça uma classe que leia um String que contenha o
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

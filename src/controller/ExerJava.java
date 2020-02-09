package controller;


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
	
	/*
	 *  Protetores de links são um recurso atualmente bastante 
	 *  utilizado na Web para esconder a URL original de uma página 
	 *  Web, na tentativa de exibir páginas de propaganda antes que o 
	 *  usuário tenha acesso à página que ele realmente deseja. Muitos
	 *  destes bloqueadores apenas invertem a URL original ou escondem 
	 *  a URL original em um parâmetro da URL da página de propaganda. 
	 *  Alguns exemplos de URL's de bloqueadores de links são mostrados abaixo: 
     *• http://protetor.net?link=moc.sopmacleonam//:ptth  
     *• http://protetor.net?link=http://pegalink.net
     *  Fazer uma classe que receba uma String com um link protegido,
     *  verifique se ele tem o perfil protegido e, exiba o link original. 
     *  Para o caso de link invertido, exiba o link já corrigido. 
	 */

	public String verificaURL(String url){
		
		url = url.trim();
		
		if(url.indexOf("http://") == 0) {
			
			return url;
		}
		
		StringBuilder sb = new StringBuilder();
		
		char[] vetor = url.toCharArray();
		
		for(int i = vetor.length -1; i >= 0; i--) {
			
			sb.append(vetor[i]);
		}
			
		
		return sb.toString();
		
		
	}
	
}

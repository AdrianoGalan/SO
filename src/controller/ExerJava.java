package controller;


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
	
	/*
	 *  Protetores de links s�o um recurso atualmente bastante 
	 *  utilizado na Web para esconder a URL original de uma p�gina 
	 *  Web, na tentativa de exibir p�ginas de propaganda antes que o 
	 *  usu�rio tenha acesso � p�gina que ele realmente deseja. Muitos
	 *  destes bloqueadores apenas invertem a URL original ou escondem 
	 *  a URL original em um par�metro da URL da p�gina de propaganda. 
	 *  Alguns exemplos de URL's de bloqueadores de links s�o mostrados abaixo: 
     *� http://protetor.net?link=moc.sopmacleonam//:ptth  
     *� http://protetor.net?link=http://pegalink.net
     *  Fazer uma classe que receba uma String com um link protegido,
     *  verifique se ele tem o perfil protegido e, exiba o link original. 
     *  Para o caso de link invertido, exiba o link j� corrigido. 
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

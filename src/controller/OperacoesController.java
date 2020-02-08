package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}

	public void operacaoString(int numero) {

		String valor = "";
		double tempoInicial = System.nanoTime();

		for (int i = 0; i < numero; i++) {

			valor = valor + "a";
		}

		double tempoFinal = System.nanoTime();

		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);

		System.out.println("String ==>" + tempoTotal + "segundos");

	}

	public void operacaoBuffer(int numero) {

		StringBuffer buffer = new StringBuffer();

		double tempoInicial = System.nanoTime();

		for (int i = 0; i < numero; i++) {

			buffer.append("a");
		}

		double tempoFinal = System.nanoTime();

		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);

		System.out.println("Buffer ==>" + tempoTotal + "segundos");

	}

	public void operacaoFrase(String frase) {
		
		String[] palavras = frase.split(" ");
		
		for(String palavra : palavras) {
			
			System.out.println(palavra);
		}
		

	}
	
	public void operacaoFraseFor(String frase){
		
		String[] palavras = frase.split(" ");
		 
		
		for(int i = 0; i < palavras.length; i++){
			
			String palavra = palavras[i];
			
			System.out.println(palavra);
		}
		
	}

}

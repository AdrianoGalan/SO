package main;

import controller.OperacoesController;

public class View {
	
	public static void main(String[] args) {
		
		
		OperacoesController operacao = new OperacoesController();
		
//		int n = Integer.MAX_VALUE;
	
//		operacao.operacaoString(n);
//		operacao.operacaoBuffer(n);
		
		String frase = "Bem vindo outra vez";
		
//		operacao.operacaoFrase(frase);
		operacao.operacaoFraseFor(frase);
	
	}

}

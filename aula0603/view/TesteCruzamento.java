package view;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import controller.ThreadCruzamento;

public class TesteCruzamento {

	public static void main(String[] args) {
	
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("N->S");
		nomes.add("S->N");
		nomes.add("L->O");
		nomes.add("O->L");
		
		Semaphore semaforo = new Semaphore(1);
		
		for (int i = 0; i < nomes.size(); i++) {
			
			Thread cru = new ThreadCruzamento(nomes.get(i), semaforo);
			cru.start();
			
		}
		

	}

}

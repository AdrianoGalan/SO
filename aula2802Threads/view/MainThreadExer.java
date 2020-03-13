package view;

import controller.ThreadExer;

public class MainThreadExer {
	
	public static void main(String[] args) {
		
		
		
		
		for (int i = 0; i < 100; i++) {
			
			Thread te = new ThreadExer(i);
			te.start();
			
		}
		
		
	}

}

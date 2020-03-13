package controller;

import java.util.concurrent.Semaphore;

public class ThreadCruzamento extends Thread {

	private String nome;
	private Semaphore semaforo;

	public ThreadCruzamento(String nome, Semaphore semaforo) {
		super();
		this.nome = nome;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			cruzamento();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} finally {
			semaforo.release();
		}

	}

	private void cruzamento() {

		System.out.println(nome);
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

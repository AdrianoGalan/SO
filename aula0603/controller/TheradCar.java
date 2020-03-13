package controller;

import java.util.concurrent.Semaphore;

public class TheradCar extends Thread {

	private int idCar;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;

	public TheradCar(int idCar, Semaphore semaforo) {

		this.idCar = idCar;
		this.semaforo = semaforo;

	}

	@Override
	public void run() {
		carroAndando();
		try {
			semaforo.acquire();
			carroEstacionado();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {

			semaforo.release();
			carroSaindo();
		}

	}

	private void carroAndando() {

		int distancioTotal = (int) ((Math.random() * 2001) + 1000);
		int distanciaPercorrida = 0;
		int deslocamento = 100;
		int tempo = 30;
		while (distanciaPercorrida < distancioTotal) {

			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Carro " + idCar + " percorreu " + distanciaPercorrida + "m. ");
		}

		posChegada++;
		System.out.println("Carro #" + idCar + " foi o " + posChegada + " a chegar");

	}

	private void carroEstacionado() {

		System.out.println("Carro #" + idCar + " estacionado");
		int tempo = (int) ((Math.random() * 2001) + 2000);

		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void carroSaindo() {
		posSaida++;
		System.out.println("Carro #" + idCar + " foi o" + posSaida + " a sair");

	}
}

package view;

import java.util.concurrent.Semaphore;

import controller.TheradCar;

public class Park {

	public static void main(String[] args) {
		
		int permissoes =3;
		Semaphore semafaro = new Semaphore(permissoes);
	
		for (int idCar = 0; idCar < 10; idCar++) {
			
			Thread car = new TheradCar(idCar, semafaro);
			car.start();
			
		}
		
		
		

	}

}

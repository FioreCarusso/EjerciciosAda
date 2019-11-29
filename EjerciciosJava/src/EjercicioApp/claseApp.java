package EjercicioApp;

import java.util.Random;

public class claseApp {
	public static int generateRandomInt(int upperRange) { // metodo de generacion de numeros aleatorios
		Random random = new Random();
		return random.nextInt(upperRange);
	}

	public static void main(String[] args) {
		float total = 0; // declaro variables de totales
		float total4mes = 0;

		Recaudacion[] año = new Recaudacion[360]; // 1) creo array de 360 lugares de clase Recaudacion

		for (int i = 0; i < año.length; i++) { // 2)
			int tarjeta = claseApp.generateRandomInt(50);
			int efectivo = claseApp.generateRandomInt(50); //
			año[i] = new Recaudacion(tarjeta, efectivo);
		}

		for (int i = 180; i < año.length; i++) { // 3)
			total += año[i].getEfectivo() + año[i].getTarjeta();
		}
		System.out.println("1) Totales de los últimos 6 meses: " + total); // 4)

		for (int i = 30 * 4; i < 30 * 5; i++) {                               //5)
			total4mes += año[i].getEfectivo() + año[i].getTarjeta();
		}
		System.out.println("2) Totales del mes 4; " + total4mes);       //6)

	}
}

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

		Recaudacion[] a�o = new Recaudacion[360]; // 1) creo array de a�o con 360 d�as

		for (int i = 0; i < a�o.length; i++) { // 2) for para atributos de los objetos
			int tarjeta = claseApp.generateRandomInt(50);
			int efectivo = claseApp.generateRandomInt(50); //
			a�o[i] = new Recaudacion(tarjeta, efectivo);
		}

		for (int i = 180; i < a�o.length; i++) { // 3)               total de 180dias=suma de parametros efe y tarj
			total += a�o[i].getEfectivo() + a�o[i].getTarjeta();
		}
		System.out.println("1) Totales de los �ltimos 6 meses: " + total); // 4)print

		for (int i = 30 * 4; i < 30 * 5; i++) {                               //5)total de 4 mes
			total4mes += a�o[i].getEfectivo() + a�o[i].getTarjeta();
		}
		System.out.println("2) Totales del mes 4; " + total4mes);       //6)

	}
}

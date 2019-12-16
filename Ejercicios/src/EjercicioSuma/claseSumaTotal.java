package EjercicioSuma;

import java.util.Scanner;

public class claseSumaTotal {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el precio del producto 1:");
		int valor = ingreso.nextInt();
		System.out.println("Ingrese el precio del producto 2:");
		int valor2 = ingreso.nextInt();
		int total = valor + valor2;
		System.out.println("El precio total de su compra es: " + total);
		ingreso.close();

	}
}

package EjercicioSuma;

import java.util.Scanner;

/**
 * genero nueva clase para ver el metodo constructor
 * 
 */
public class claseSumaTotalConstructor {
	private int valor1;
	private int valor2; // Le agrego atributo valor1y2 a la clase

	/**
	 * creo un metodo constructor 
	 */

	public claseSumaTotalConstructor() { // Agrego un metodo constructor (va a ser ejecutado llamado por el main)

		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el precio del producto 1:");
		valor1 = ingreso.nextInt();               // las variables anteriores ahora son atributos del objeto
		System.out.println("Ingrese el precio del producto 2:");
		valor2 = ingreso.nextInt();
		int total = valor1 + valor2;
		System.out.println("El precio total de su compra es: " + total);
		ingreso.close();
	}

	/**
	 * creo el metodo main
	 * 
	 */
	public static void main(String[] args) {
		claseSumaTotalConstructor ejer = new claseSumaTotalConstructor(); // instancio la clase con un obj ejer
																// va a leer y ejecutar el constructor de arriba
	}
}

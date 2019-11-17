package EjercicioValorMayor;

import java.util.Scanner;

/**
 * en esta clase se requiere precisar cual de los valores es el mayor (a,b y c)
 * 
 *
 */
public class claseEjercicio2_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		int a = scan.nextInt();
		System.out.println("Ingrese segundo valor: ");
		int b = scan.nextInt();
		System.out.println("Ingrese un tercer valor: ");
		int c = scan.nextInt();
		int valorMayor;
		if (a > b && a > c) {
			valorMayor = a;
		} else {
			valorMayor = c;
		}
		if (b > c) {
			valorMayor = b;
		} else {
			valorMayor = c;
		}

		System.out.println("El valor mayor es: " + valorMayor);

	}

}

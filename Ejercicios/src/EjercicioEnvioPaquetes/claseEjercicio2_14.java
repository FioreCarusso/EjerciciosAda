package EjercicioEnvioPaquetes;

import java.util.Scanner;

public class claseEjercicio2_14 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // inicia el scaneo del teclado

		System.out.println("SISTEMA DE ENVIO");

		System.out.println("Ingrese peso del paquete: ");
		int peso = scan.nextInt(); // creo variable peso que va a leer el ingreso del usuario
		if (peso > 5000) { // realizo una condicion if (si peso es mayor a 5k) entonces
			System.out.println("No se puede realizar el envio de paquetes superiores a 5kg");

		} else {
			System.out.println("Zona del envio: "); // mostramos al usuario qué numero corresponde a qué zona
			System.out.println("1) America del Norte");
			System.out.println("2) Amercia Central");
			System.out.println("3) America del Sur");
			System.out.println("4) Europa");
			System.out.println("5) otro");
			System.out.println("Seleccione número de zona"); // guardamos en la variable nz el numero de zona ingresado
																// por el usuario
			int nz = scan.nextInt();
			float costo; // creo variable costo
			switch (nz) {
			case 1:
				costo = 11 * peso;
				break;
			case 2:
				costo = 10 * peso;
				break;
			case 3:
				costo = 12 * peso;
				break;
			case 4:
				costo = 24 * peso;
				break;
			default:
				costo = 27 * peso;
				break;

			}

			System.out.println("El costo de envio es de: " + costo);

		}

	}

}

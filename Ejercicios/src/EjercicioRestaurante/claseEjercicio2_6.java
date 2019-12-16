package EjercicioRestaurante;

import java.util.Scanner;

public class claseEjercicio2_6 { // resta hacer ciclo while para que de 0

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Presupuesto para clientes Langosta Ahumada");
		System.out.println();
		System.out.println("Ingrese cantidad de comensales: (0=salir)");
		int cantP = scan.nextInt();
		int pres;
		int valorPer;
		while (cantP != 0) {         //bucle de ejecucion de if (while) 
			if (cantP > 300) {       // si la variable es distinta de cero
				pres = cantP * 750;  //si es 0 va a terminar el bucle de ifs y elses
				valorPer = 750;
			} else {
				if (cantP > 200) {
					valorPer = 850;
					pres = cantP * 850;
				} else {
					pres = cantP * 950;
					valorPer = 950;
				}
			}

			System.out.print("El valor por persona es de: $" + valorPer);

			System.out.print(" y el valor total es de: $" + pres);
			System.out.println();
			System.out.println();
			System.out.println("Ingrese cantidad de comensales: (0=salir)");
			cantP = scan.nextInt();     //no es necesario volver a declarar la variable cantP

		}
	}

}
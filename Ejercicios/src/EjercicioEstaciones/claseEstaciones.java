package EjercicioEstaciones;

import java.util.Scanner;

public class claseEstaciones {
	// creo matriz de 2 arrays
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0; // inicializo matriz
			}
		}

		// inicializo variables
		int ventasxNafta[] = { 0, 0, 0 }; // nuevos arrays
		int ventasxEstacion[] = { 0, 0, 0 };
		int totalVentas = 0;
		String nombres[] = { "Flores", "Floresta", "Caballito" };
		String[] naftas = { "Super", "Premium", "GasOil" };

		// comienza el proceso
		System.out.println("VENTAS DE SURTIDORES");
		System.out.println("");
		// pido cantidad de litros
		System.out.println("Ingrese cantidad de litros");
		Scanner scan = new Scanner(System.in);
		int cantLitros = scan.nextInt();
		// inicio ciclo while
		while (cantLitros != 0) {
			// pido tipo de nafta
			System.out.println("Ingrese tipo de nafta");
			System.out.println("0) Nafta Super");
			System.out.println("1) Nafta Premium");
			System.out.println("2) GasOil");
			int tipoNafta = scan.nextInt();

			// calculo venta combustible (litro*valornafta)
			switch (tipoNafta) {
			case 0:
				totalVentas = cantLitros * 20;
				break;
			case 1:
				totalVentas = cantLitros * 40;
				break;
			case 2:
				totalVentas = cantLitros * 10;
				break;

			} // pido sucursal
			System.out.println("Ingrese estación de servicio");
			System.out.println("0) Shell Flores");
			System.out.println("1) Floresta");
			System.out.println("2) Caballito");
			int sucEstacion = scan.nextInt();

			// calculo ventas totales, por tipo de nafta y sucursal
			matriz[tipoNafta][sucEstacion] += totalVentas;
			ventasxNafta[tipoNafta] += totalVentas;
			ventasxEstacion[sucEstacion] += totalVentas;

			// sigo pidiendo valores
			System.out.println("");
			System.out.println("Ingrese cantidad de litros");
			cantLitros = scan.nextInt();

		} // termina ciclo while

		// muestro los resultados

		System.out.println("Total de ganancias por sucursales Shell:");
		for (int i = 0; i < ventasxEstacion.length; i++) {
			System.out.println("Sucursal:" + nombres[i] + ": $" + ventasxEstacion[i]);
		}
		System.out.println("Total de ganancias por tipo de nafta:");
		for (int i = 0; i < ventasxNafta.length; i++) {
			System.out.println("Nafta" + naftas[i] + ": $" + ventasxNafta[i]);
		}

		System.out.print("Tipo de nafta más vendida: ");
		int masVendida = 0;
		int indicemasVendido = 0;

		for (int i = 0; i < ventasxNafta.length; i++) {
			if (ventasxNafta[i] > masVendida) {
				masVendida = ventasxNafta[i];
				indicemasVendido = i;
			}
		}
		System.out.print(naftas[indicemasVendido] + ": " + masVendida);

	}

}

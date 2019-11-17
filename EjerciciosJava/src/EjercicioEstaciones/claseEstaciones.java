package EjercicioEstaciones;

import java.util.Scanner;

public class claseEstaciones {
      //creo matriz de 2 arrays
	public static void main(String[] args) {
		float[][] matriz = new float[3][3]; 
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz.length; j++) { 
				matriz[i][j] = 0;             
			}
		}
        
		//inicializo variables
		float totalxNafta[] = new float[3]; 
		float totalxEstacion[] = new float[3]; 
		float totalVenta = 0;
		
		//comienza el proceso
		System.out.println("VENTAS DE SURTIDORES"); 
		System.out.println("");
		//pido cantidad de litros
		System.out.println("Ingrese cantidad de litros");              
		Scanner scan = new Scanner(System.in);
		float cantLitros = scan.nextFloat();
		//inicio ciclo while
		while (cantLitros != 0) {                   
			//pido tipo de nafta
			System.out.println("Ingrese tipo de nafta");               
			System.out.println("0) Nafta Super");
			System.out.println("1) Nafta Premium");
			System.out.println("2) GasOil");
			int tipoNafta = scan.nextInt();
			
			//calculo venta combustible (litro*valornafta)
			switch (tipoNafta) {                      
			case 0:
				totalVenta = cantLitros * 20;
				break;
			case 1:
				totalVenta = cantLitros * 40;
				break;
			case 2:
				totalVenta = cantLitros * 10;
				break;

			}  //pido sucursal
			System.out.println("Ingrese estación de servicio");        
			System.out.println("0) Shell Flores");
			System.out.println("1) Shell Caballito");
			System.out.println("2) Shell Palermo");
			int sucEstacion = scan.nextInt();
            
			//calculo ventas totales por tipo de nafta y sucursal  
			matriz[tipoNafta][sucEstacion] += totalVenta;             
			totalxNafta[tipoNafta] += totalVenta;                   
			totalxEstacion[sucEstacion] += totalVenta;
			
			//sigo pidiendo valores
			System.out.println("");
			System.out.println("Ingrese cantidad de litros");          
			cantLitros = scan.nextFloat();

		} //termina ciclo while
		
		//muestro los resultados 

		System.out.println("Total de ganancias por sucursales Shell:");
		for (int i = 0; i < totalxEstacion.length; i++) {
			System.out.println(i + ": $" + totalxEstacion[i]);
		}
		System.out.println("Total de ganancias por tipo de nafta:");
		for (int i = 0; i < totalxNafta.length; i++) {
			System.out.println(i + ": $" + totalxNafta[i]);
		}

		System.out.print("Tipo de nafta más vendida: ");
		int masVendida = 0;
		if (totalxNafta[0] > totalxNafta[1] && totalxNafta[0] > totalxNafta[2]) {
			masVendida = 0;
		} else if (totalxNafta[1] > totalxNafta[2]) {
			masVendida = 1;
		} else {
			masVendida = 2;
		}

		System.out.print(masVendida);

	}

}

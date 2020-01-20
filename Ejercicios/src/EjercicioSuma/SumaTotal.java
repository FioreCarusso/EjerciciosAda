package EjercicioSuma;

import java.util.Scanner;

public class SumaTotal {
	
int valor;
int valor2;
int total;

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Ingrese el precio del producto 1:");
	 int valor = scan.nextInt();
	System.out.println("Ingrese el precio del producto 2:");
	 int valor2 = scan.nextInt();
	 int total = valor + valor2;
	System.out.println("El precio total de su compra es: " + total);
}
		
	}


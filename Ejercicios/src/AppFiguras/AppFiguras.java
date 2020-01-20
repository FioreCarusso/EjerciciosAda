package AppFiguras;

import java.util.Scanner;

/**
 * Generar las clases de las figuras geometricas triangulo y rectangulo 
 * y exponer al menos un metodo que calcule el area de la figura
 * Los valors se debe ingresar por teclado
 * Generar un objeto de cada clase 
 *
 */
public class AppFiguras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de calculo de area");
		System.out.println();
		System.out.println("Ingrese tipo figura (1: Triangulo || 2: Rectangulo");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1: {
			Triangulo fgTri = new Triangulo();
			System.out.println("Ingrese base:");
			int base = sc.nextInt();
			System.out.println("Ingrese altura:");
			int altura = sc.nextInt();
			fgTri.setBase(base);
			fgTri.setAltura(altura);
			System.out.println("El area es: " + fgTri.area());
			
			break;
		}
		case 2: {
			Rectangulo fgRect = new Rectangulo();
			System.out.println("Ingrese base:");
			int base = sc.nextInt();
			System.out.println("Ingrese altura:");
			int altura = sc.nextInt();
			fgRect.setBase(base);
			fgRect.setAltura(altura);
			System.out.println("El area es: " + fgRect.area());
			
			break;
		}

		default:
			break;
		}
		
		
	}

	
	
}

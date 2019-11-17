package EjercicioPromedio;

import java.util.Scanner;

public class clasePromedio {
	int nota1;
	int nota2; // atributos de clase Promedio
	int nota3;

	public clasePromedio() { // metodo constructor (sera invocado por el main)
		System.out.println("Ingrese cantidad de notas: ");
		Scanner scan = new Scanner(System.in);
		int cantNotas = scan.nextInt(); // en variable cantNotas se guarda lo que ingresa el usuario
		int[] notas = new int[cantNotas];     //notas es igual a cantNotas ingresadas
		float promedio = 0;                   //inicializo variable promedio (le doy valor)
		for (int i = 0; i < cantNotas; i++) { // va a leer en bucle desde notas=0 hasta la cantidad de notas-1(ahi se detiene)
			System.out.println("Ingrese nota" + (i + 1)); // imprime notas mas el numero de notas
			notas[i] = scan.nextInt();              
			promedio += notas[i];

		}

		System.out.println("el promedio es " + promedio / cantNotas); // muestra el resultado e imprime operación

	}

	public static void main(String[] args) {
		clasePromedio prom1 = new clasePromedio();

	}

	public int getNota1() {
		return nota1;

	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;

	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

}

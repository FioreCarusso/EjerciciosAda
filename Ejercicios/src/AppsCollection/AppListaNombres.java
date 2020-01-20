package AppsCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class AppListaNombres {

	public static void main(String[] args) {

		String nombre = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre (. para terminar)");
		nombre = sc.next();
		ArrayList<String> lista = new ArrayList<String>();

//		while (!nombre.equals(".")) {
		while (! ".".equals(nombre)) {
			lista.add(nombre);
			System.out.println("Ingrese nombre (. para terminar)");
			nombre = sc.next();
		}

//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		for (String j: lista) {
			System.out.println(j);
		}

	}
}

package AppsCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppListaPersona {
	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		String nombre = "";
		String dni = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre (. para terminar)");
		nombre = sc.next();
		while (!nombre.equals(".")) {
			System.out.println("Ingrese DNI:");
			dni = sc.next();
			Persona p = new Persona(nombre, dni);
			lista.add(p);
			System.out.println("Elemento agregado correctamente. Lista: " + lista.size());
			System.out.println("Ingrese nombre (. para terminar)");
			nombre = sc.next();
		}
		
		for (Persona itemPersona : lista) {
			System.out.println(itemPersona.getDni() + " " + itemPersona.getNombre());
		}
		
		
		
	}

}

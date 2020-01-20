package AppsCollection;

import java.util.ArrayList;

public class AppList {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		System.out.println("Tamaño lista " + lista.size());

		lista.add("elem1");
		System.out.println("Tamaño lista " + lista.size());
		lista.add("elem2");

		for (int i = 0; i < lista.size(); i++) {

			System.out.println("elemento " + lista.get(i));
		}
		System.out.println("Tamaño lista " + lista.size());
		System.out.println("Elimina elemento " + lista.remove(0));
		System.out.println("Tamaño lista " + lista.size());
	}
}

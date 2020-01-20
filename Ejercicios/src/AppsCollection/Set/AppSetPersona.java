package AppsCollection.Set;

import java.util.HashSet;

import java.util.Iterator;

import AppsCollection.Persona;

public class AppSetPersona {
	
	public static void main(String[] args) {
		
		HashSet<Persona>hash = new HashSet<Persona>();
		System.out.println("Size: " + hash.size());
		
		Persona primero = new Persona("Primero", "123");
		System.out.println(primero.hashCode());
		hash.add(primero);
		System.out.println("Size: " + hash.size());
		
		Persona segundo = new Persona("Segundo", "234");
		System.out.println(segundo.hashCode());
		hash.add(segundo);
		System.out.println("Size: " + hash.size());

		hash.add(segundo);
		System.out.println("Size: " + hash.size());
		
		//recorrer set
		Iterator<Persona> it = hash.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getNombre());
		}
	}
	

}

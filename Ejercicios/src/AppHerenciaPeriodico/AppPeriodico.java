package AppHerenciaPeriodico;

import java.awt.Dimension;
import java.util.Scanner;

public class AppPeriodico {
	/**
	 * En el periodico tenemos anuncios y notas. Se pueden publicar en 5 viñetas por
	 * dia. Se solicita generar la estructura de clases que soporte la informacion
	 * (OK) necesaria Ingresar por teclado los datos y se cargan las 5 posiciones de
	 * las viñetas del periodico, mostrar el contenido de todas
	 */

	public static void main(String[] args) {

		System.out.println("APLICACION PERIODICO");
		Viñeta[] pagina = new Viñeta[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < pagina.length; i++) {
			System.out.println("Tipo (1: publicidad 2:articulo)");
			int tipo = scan.nextInt();

			System.out.println("Seccion: ");
			String seccion = scan.next();
			// el resto de los atributos

			switch (tipo) {
			case 1: {
				System.out.println("Auspiciante: ");
				String ausp = scan.next();
				System.out.println("Precio: ");
				float precio = scan.nextFloat();
				Publicidad pub = new Publicidad("", "", seccion, "", new Dimension(3, 2), ausp, precio);
				pagina[i] = pub;
				break;
			}
			case 2: {
				System.out.println("Titulo: ");
				String titulo = scan.next();
				System.out.println("Autor: ");
			    String autor = scan.next();
				System.out.println("Cuerpo: ");
				String cuerpo= scan.next();
				Articulo art = new Articulo(titulo, autor, cuerpo, "", "", seccion, "", new Dimension(2, 2));
				pagina[i] = art;

			}
			
			
			}

		}

	}

}

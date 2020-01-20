package AppExcepciones;

public class AppExcepcion {

	public static void main(String[] args) {

//		int valor = 5;
//		int divisor = 0;
//		System.out.println(valor/divisor);       va a devolver por consola una excepcion (aritmetica)

		Pasaje[] micro = new Pasaje[40];

		// PEDIR DATOS DEL PASAJERO
		Pasaje pas = new Pasaje();
		pas.setDni("123");
		pas.setNombre("ABC");
		try {

			VentaPasaje vp = new VentaPasaje();
			vp.vender(micro, pas);

		} catch (Exception e) {
			System.out.println("se lanzo una excepcion " + e.getMessage());

		}
		finally {
			// MAS CODIGO
			System.out.println("PRUEBA FINALLY");
		}
	}
}

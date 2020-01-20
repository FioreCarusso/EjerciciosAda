package AppExcepciones;

public class AppExcepciones {
	
	public static void main(String[] args) {
		
		int valor = 5;
		int divisor = 0;
		 
		
		//no se va a ejecutar por ser una excepcion aritmetica (0 no es divisible)
	//	System.out.println(valor/divisor);
		try {                            
		//	Object prueba = null;
		Object prueba = new Object();
		
		prueba.toString();        //intento ejecutar metodo toString y lanza una excepcion
		                            //lo muestra por pantalla, no sigue ejecutando
		
		int cant = 0;
		
		//venta
		if (cant == 0) {
			throw new AgotadoException("no quedan mas pasajes");
		} else {
			System.out.println("bienvenido al sistema de cobros");
		}
		
		} catch (Exception e) {        //en caso de excepcion, se captura y se convierte en objeto "e"
			System.out.println("se lanzo una excepcion " + e.getMessage());
	
		
		
		
		}
		
		
		
	}

}

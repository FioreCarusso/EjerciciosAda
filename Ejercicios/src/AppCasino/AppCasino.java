package AppCasino;

import java.util.Random;

public class AppCasino {
//// Simular la ejecucion de la ruleta y acumular las primeras 100 
	// ejecuciones.
	// Mostrar los tres numeros que salieron mas veces
	// Usamos Ramdom y vectores. No hay objetos
	public static int aleatorio(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);

	}

	public static void main(String[] args) {

		
		System.out.println("JUEGO DE LA RULETA");
		System.out.println("PRIMEROS 100 NUMEROS: ");
		
		Numero[] ruleta = new Numero[37];        //array de clase numero con 37posiciones en cada posicion va a ver un numero

	
		for (int i = 0; i < 37; i++) {
			ruleta[i] = new Numero(i);        //   objeto listo para usar
		}
        for (int i=0; i<100; i++) {
        	int sorteo = aleatorio(37);
        ruleta[sorteo].acumular();                            
        }
        for (int i=0; i< ruleta.length; i++) {
        	System.out.println(ruleta[i]);
        }
	}

}

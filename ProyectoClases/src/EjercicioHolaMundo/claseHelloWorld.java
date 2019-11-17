package EjercicioHolaMundo;

/**
 * clase publica donde crearemos objetos per1 y per2
 * 
 * @author lenovo
 *
 */
public class claseHelloWorld {

	/**
	 * metodo main que iniciara la lectura de código linea por linea
	 * 
	 */
	public static void main(String[] args) {

		/**
		 * creamos los objetos, se le agrega valor a los metodos set y se imprime el
		 * metodo get
		 * 
		 */
		clasePersona per = new clasePersona();
		per.setAltura(150);
		per.setNombre("Amelia");
		per.setFuma(false);
		per.setNacionalidad("Española");

		clasePersona per2 = new clasePersona();
		per2.setAltura(175);
		per2.setNombre("Joaquin");
		per2.setFuma(true);
		per2.setNacionalidad("Español");

		System.out.println(per.getNombre());
		System.out.println(per.getAltura());
		System.out.println(per.getNacionalidad());
		System.out.println(per.isFuma());

		System.out.println();

		System.out.println(per2.getNombre());
		System.out.println(per2.getAltura());
		System.out.println(per2.getNacionalidad());
		System.out.println(per2.isFuma());

	}

}

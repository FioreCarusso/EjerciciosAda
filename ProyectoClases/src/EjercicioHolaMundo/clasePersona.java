package EjercicioHolaMundo;

/**
 * Clase Persona donde declaramos atributos y metodos getters y setters
 *
 * @author lenovo
 *
 */
public class clasePersona {

	private int altura;
	private String nombre;
	private String fumador;
	private boolean fuma = false;         //atributos de la clase
	private char sexo;
	private float peso;
	private double sueldo;
	private String nacionalidad;
	private clasePersona padre;
	private clasePersona madre;

	public int getAltura() {         //metodos de la clase 
		return altura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFumador() {
		return fumador;
	}

	public boolean isFuma() {
		return fuma;
	}

	public char getSexo() {
		return sexo;

	}

	public float getPeso() {
		return peso;

	}

	public double getSueldo() {
		return sueldo;

	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public clasePersona getPadre() {
		return padre;
	}

	public clasePersona getMadre() {
		return madre;

	}

	/**
	 * aquí utilizamos los metodos setters
	 * 
	 */
	public void setAltura(int alt) {
		altura = alt;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setFumador(String fumador) {
		this.fumador = fumador;

	}

	public void setFuma(boolean fuma) {
		this.fuma = fuma;

	}

	public void setSexo(char sexo) {
		this.sexo = sexo;

	}

	public void setPeso(float peso) {
		this.peso = peso;

	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;

	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;

	}

	public void setPersona(clasePersona madre) {
		this.madre = madre;

	}

	public void setPersona1(clasePersona padre) {
		this.padre = padre;
	}

}

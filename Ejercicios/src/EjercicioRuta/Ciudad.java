package EjercicioRuta;

public class Ciudad {

	private String nombre;
	private int km;

	public String getNombre() {
		return nombre;
	}

	public int getKm() {
		return km;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	public Ciudad (int km, String nombre) {
		this.km = km;
		this.nombre = nombre;
	}

}
 
 
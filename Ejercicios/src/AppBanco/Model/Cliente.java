package AppBanco.Model;

public class Cliente {

	//atributos
	private String nombre;
	private String dni;
	private CajaAhorro cajaAhorro;
	private CuentaCorriente cuentaCorriente;
	
	
	//metodos
	public String getNombre() {
		return nombre;
	
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public CajaAhorro getCajaAhorro() {
		return cajaAhorro;
	}
	public void setCajaAhorro(CajaAhorro cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}
	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}
	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	 
	
}

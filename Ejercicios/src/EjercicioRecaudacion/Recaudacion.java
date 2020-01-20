package EjercicioRecaudacion;

public class Recaudacion {
	
	private float tarjeta;
	private float efectivo;
	
	public Recaudacion(float tarjeta, float efectivo) {    //3)
		this.efectivo= efectivo;
		this.tarjeta = tarjeta;
	

	}
	public float getTarjeta() {
		return tarjeta;
	}
	public float getEfectivo() {
		return efectivo;
	}
	
	public void setEfectivo(int efectivo) {
		this.efectivo = efectivo;
	}
	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}

}

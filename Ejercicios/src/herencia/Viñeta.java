package herencia;

import java.awt.Dimension; //tiene dos atributos: ancho y largo del rectangulo de la publi

//colocamos los atritutos que tienen en comun las viñetas
public class Viñeta {

	private String imagen; // ubicacion fisica del archivo imagen
	protected String link;
	protected String seccion;
	protected String posicion;
	protected Dimension dimension;

	// source generate constructor
	public Viñeta(String imagen, String link, String seccion, String posicion, Dimension dimension) {
		this.imagen = imagen;
		this.link = link;
		this.seccion = seccion;
		this.posicion = posicion;
		this.dimension = dimension;
	}

//getters y setters	    

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

}

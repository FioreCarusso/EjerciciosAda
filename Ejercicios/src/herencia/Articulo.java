package herencia;

import java.awt.Dimension;

public class Articulo extends Viñeta {

//atributos de la clase
	private String autor;
	private String titulo;
	private String cuerpo;

//constructor	
	public Articulo(String imagen, String autor, String titulo, String cuerpo, String link, String seccion,
			String posicion, Dimension dimension) {
		super(imagen, link, seccion, posicion, dimension);
		this.autor = autor;
		this.cuerpo = cuerpo;
		this.titulo = titulo;
	}

	// getters y setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

}

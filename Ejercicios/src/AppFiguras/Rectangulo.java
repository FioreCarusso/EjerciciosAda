package AppFiguras;

public class Rectangulo extends FiguraGeometrica{

	private int altura;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public float area() {
		return getAltura() * getBase();
	}
}

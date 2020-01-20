package AppFiguras;

public class Cuadrado extends FiguraGeometrica {
	
	public float area() {
		return getBase() * getBase();
	}
	
	public float perimetro() {
		return getBase() * 4;
	}

}

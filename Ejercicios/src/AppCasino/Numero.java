package AppCasino;

public class Numero {
         
	private int contador;
	private String color;              //atributos
	private int valor;
	
public Numero ( int valor) {
	this.valor = valor;                //constructor con 1 valor
	this.contador = contador;
}
	
	public Numero (int valor, String color) {    //3)
		
	    this.valor = valor;
	    this.color =color;            
	    this.contador= 0;
	
	}
	public void contador(int contador) {
	this.contador = contador;
	}
	public int getcontador() {
		return contador;
	}
	public void setColor(String color) {
		this.color = color;
		}
		public String getColor() {
			return color;
		}
		public void setValor(int valor) {
			this.valor = valor;
			}
			public int getValor() {
				return valor;
			}
			
			public void acumular() {
				this.contador++;
			}
			public String toString() {            //al ejecutar me va a mostrar por consola de forma mas legible
				return valor + " " + contador;
			}
}


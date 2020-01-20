package AppTienda;

public class Pedido {

	private Producto producto;
	private int cantidad;
	private float precio;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void vender(Producto prod, int cant) throws SinStockException {
		if (cant > prod.getStock()) {
			throw new SinStockException();
		}
		else {
			prod.setStock(prod.getStock() - cant);
			System.out.println("Producto vendido. Stock actual: " + prod.getStock());
		}
		
	}

}

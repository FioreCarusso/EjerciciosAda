package AppTienda;

import java.util.Scanner;

/**
 * En la tienda se venden heladeras y lavarropas. Esos productos tienen stock,
 * descipcion y precio.
 * En el caso que no haya stock disponible, lanzar SinStockException.
 * Generar las clases necesarias y tomar el pedido del cliente para calcular
 * el total de la venta
 *
 */
public class AppTienda {

	public static void main(String[] args) {
		System.out.println("SISTEMA VENTA DE ELECTRODOMESTICOS");
		
		// INGRESO DE DATOS DEL PRODUCTO
		Lavarropas lav = new Lavarropas(0, "Drean 8kg", 20000);
		Heladera hel = new Heladera(1, "Gafa no frost", 25000);
		
		
		// INGRESO DE DATOS DEL PEDIDO
		System.out.println("Ingrese tipo producto: 1.Heladera 2.Lavarropas");
		Scanner sc = new Scanner(System.in);
		int tipoProd = sc.nextInt();
		System.out.println("Ingrese cantidad del producto pedido:");
		int stockPedido = sc.nextInt();
		
		System.out.println("Ingrese precio del producto pedido:");
		float precio = sc.nextFloat();
		
		Pedido p = new Pedido();
		p.setCantidad(stockPedido);
		p.setPrecio(precio);
		try {
			if (tipoProd == 1) {
				p.vender(hel, stockPedido);
			}
			else {
				p.vender(lav, stockPedido);
			}
		}
		catch (SinStockException e) {
			System.out.println("No se realizo la venta por falta de stock");
		}
		
	}
}

package AppBanco;

import java.util.Scanner;

import AppBanco.Exceptions.SinSaldoException;
import AppBanco.Model.CajaAhorro;
import AppBanco.Model.Cliente;
import AppBanco.Model.CuentaCorriente;

public class AppBanco {

	public static void main(String[] args) {
		
//pedimos datos del cliente
		Scanner scan = new Scanner(System.in);
		System.out.println("SISTEMA DE CAJAS SUCURSAL BANCO ADA");
		
		
		System.out.println("Ingrese nombre del cliente");
		String nombre = scan.next();
		
		System.out.println("Ingrese DNI del cliente");
		
		String dni = scan.next();
		
//generamos objetos de clase cliente, y cuentas (caja ahorro y cc)		
		
		Cliente cliente = new Cliente();      
		cliente.setDni(dni);
		cliente.setNombre(nombre);     //seteamos de los objetos
		
		CajaAhorro cajaA = new CajaAhorro();
		cajaA.setNumeroCuenta("001");
		cajaA.setSaldo(1000);
		
		CuentaCorriente cuentaC = new CuentaCorriente();
		cuentaC.setNumeroCuenta("002");
		cuentaC.setSaldo(1000);
		cuentaC.setDescubierto(500);
		
		cliente.setCuentaCorriente(cuentaC);
		cliente.setCajaAhorro(cajaA);
		
		System.out.println("Ingrese el monto que quiere extraer");
		float monto = scan.nextFloat();
		
		
		System.out.println("Ingrese cuenta a debitar: 1)Caja ahorro. 2)Cuenta Corriente.");
		String tipoCuenta = scan.next();
		
		try {                             //try de metodos extraer
		switch(tipoCuenta) {
		case "1":
			// extraer de caja de ahorro
			cliente.getCajaAhorro().extraer(monto);
			break;
		case "2":
			// extraer de cuenta corriente

			cliente.getCuentaCorriente().extraer(monto);
			break;
		} 
		} catch (SinSaldoException e) {
		
		
		
		
		
	}
	}
}

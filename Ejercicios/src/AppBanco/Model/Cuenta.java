package AppBanco.Model;

import AppBanco.Exceptions.SinSaldoException;

public abstract class Cuenta {
	
	protected float saldo;
	protected String numeroCuenta;
	
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public void extraer(float monto) throws SinSaldoException {
		if (saldo >= monto) {
			saldo = saldo - monto;
			System.out.println("La operación fue realizada");
			System.out.println("Su nuevo saldo es: " + saldo);

		} else {
			throw new SinSaldoException("Su saldo es insuficiente: " + saldo);
		}
	}

}

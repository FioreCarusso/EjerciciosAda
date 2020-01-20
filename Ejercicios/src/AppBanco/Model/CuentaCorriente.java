package AppBanco.Model;

import AppBanco.Exceptions.SinSaldoException;

public class CuentaCorriente extends Cuenta {

	private float descubierto;

	public float getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(float descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public void extraer(float monto) throws SinSaldoException {
		if (saldo + descubierto >= monto) {
			saldo = saldo - monto;
			System.out.println("La operación fue realizada");
			System.out.println("Su nuevo saldo es: " + saldo);

		} else {
			throw new SinSaldoException("Su saldo es insuficiente: " + saldo);
		}

	}
}

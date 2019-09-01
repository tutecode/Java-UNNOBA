package ejerBanco;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();

	public void agregarTransaccion(Transaccion t) {
		transacciones.add(t);
	}
	
	public int cantidadTotalTransacciones() {
		return transacciones.size();
	}
	
	public float impuestoACobrarDe(Transaccion t) {
		return t.calcularImpuesto();
	}
	
	public float impuestosACobrar() {
		float total = 0;
		for(Transaccion t: transacciones) {
			total += t.calcularImpuesto();
		}
		return total;
	}
	
	public float montoTotalDeTransaccion() {
		float total = 0;
		for(Transaccion t: transacciones) {
			total += t.getMonto();
		}
		return total;
	}
	
	
	
	
	

}

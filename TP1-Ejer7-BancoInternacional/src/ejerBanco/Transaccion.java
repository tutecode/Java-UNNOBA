package ejerBanco;

public abstract class Transaccion {
	private float monto;
	private Cliente cliente;
	
	public abstract float calcularImpuesto();

	public float getMonto() {
		return monto;
	}
	

}

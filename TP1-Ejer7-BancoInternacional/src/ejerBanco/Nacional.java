package ejerBanco;

public class Nacional extends Transaccion {
	private final float PORCENTAJE = 0.08f;
	
	@Override
	public float calcularImpuesto() {
		// TODO Auto-generated method stub
		return (getMonto() * PORCENTAJE);
	}
	
}

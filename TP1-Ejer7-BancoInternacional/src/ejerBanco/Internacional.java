package ejerBanco;

public class Internacional extends Transaccion{
	private final float PORCENTAJE = 0.1f;
	private Banco bancoDestino;

	@Override
	public float getMonto() {
		return (super.getMonto() * bancoDestino.getMoneda());
	}

	@Override
	public float calcularImpuesto() {
		return (getMonto() * PORCENTAJE * bancoDestino.getMoneda());
	}
	
	
}

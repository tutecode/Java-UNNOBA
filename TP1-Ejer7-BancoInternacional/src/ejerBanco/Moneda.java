package ejerBanco;

public enum Moneda{
	EURO(31.47f), YEN(0.27f), DOLAR(60.0f);

	private final float precio;
	
	private Moneda(float precio){
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}
	
	
}

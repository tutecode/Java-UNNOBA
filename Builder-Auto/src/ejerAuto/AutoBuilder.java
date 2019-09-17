package ejerAuto;

/*
 * Siguiendo con nuestro ejemplo, definimos nuestro Builder llamado AutoBuilder. 
 * El Builder define al menos dos cosas: 
 * un m�todo para devolver el Producto (el "auto" en nuestro caso) y 
 * los m�todos necesarios para la construcci�n del mismo.
 */


public abstract class AutoBuilder {
	protected Auto auto;
	
	public Auto getAuto() {
		return auto;
	}
	
	public void crearAuto() {
		auto = new Auto();
	}
	
	public abstract void buildMotor();
	
	public abstract void buildModelo();

	public abstract void buildMarca();
	
	public abstract void buildPuertas();
}

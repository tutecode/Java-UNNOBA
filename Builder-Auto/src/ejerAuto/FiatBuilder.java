package ejerAuto;

/*
 * Serán los ConcreteBuilders los encargados de colocarle la lógica de construcción de cada Auto en particular. 
 * En nuestro caso, tendremos dos ConcreteBuilder: FiatBuildery FordBuilder. 
 * Recordemos que, en nuestro ejemplo, 
 * son clases que construyen objetos muy sencillos con datos hardcodeados para facilitar el aprendijaze del patrón en sí.
 */
public class FiatBuilder extends AutoBuilder{

	@Override
	public void buildMotor() {
		// TODO Auto-generated method stub
		Motor motor = new Motor();
		motor.setNumero(232323);
		motor.setPotencia("23 HP");
		auto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		// TODO Auto-generated method stub
		auto.setModelo("Palio");
	}

	@Override
	public void buildMarca() {
		// TODO Auto-generated method stub
		auto.setMarca("Fiat");
	}

	@Override
	public void buildPuertas() {
		// TODO Auto-generated method stub
		auto.setCantidadDePuertas(2);
	}
	
}

package ejerAuto;

public class FordBuilder extends AutoBuilder{

	@Override
	public void buildMotor() {
		// TODO Auto-generated method stub
		Motor motor = new Motor();
		motor.setNumero(212121);
		motor.setPotencia("20 HP");
		auto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		// TODO Auto-generated method stub
		auto.setModelo("Focus");
	}

	@Override
	public void buildMarca() {
		// TODO Auto-generated method stub
		auto.setMarca("Ford");
	}

	@Override
	public void buildPuertas() {
		// TODO Auto-generated method stub
		auto.setCantidadDePuertas(4);
	}
	
	
}

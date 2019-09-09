package ejerPan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanFactoryMethod factory = new PanFactory();
		//Ingresar 75 - 85 - 100
		Pan pan = factory.createPan(100);
		System.out.println(pan.getTipoDePan());
		
		
	}

}

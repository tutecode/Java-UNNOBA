package ejerPan;

public class PanFactory implements PanFactoryMethod{
	public Pan createPan(int medidaGrano) {
		if(medidaGrano == 75) {
			return new Blanco(medidaGrano);
		}
		else if(medidaGrano == 100) {
			return new Integral(medidaGrano);
		}
		else if(medidaGrano == 85) {
		 return new Negro(medidaGrano);	
		}
		return null;
	}
}

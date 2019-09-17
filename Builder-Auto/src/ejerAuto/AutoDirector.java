package ejerAuto;

/*
 * Por último, realizaremos el Director. 
 * Lo primero que debe hacerse con esta clase es enviarle el tipo de auto que se busca construir (Ford, Fiat, etc). 
 * Luego, al llamar al método constructAuto(), la construcción se realizará de manera automática.
 */

public class AutoDirector {
	//No es necesario que exista la palabra Director
	//Esta clase podría llamarse Concesionaria, Garage, FabricaDeAutos, etc.
	
	private AutoBuilder autoBuilder;
	
	public void constructAuto() {
		autoBuilder.crearAuto();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildMotor();
		autoBuilder.buildPuertas();
	}

	public Auto getAuto() {
		return autoBuilder.getAuto();
	}
	
	public AutoBuilder getAutoBuilder() {
		return autoBuilder;
	}

	public void setAutoBuilder(AutoBuilder autoBuilder) {
		this.autoBuilder = autoBuilder;
	}
}

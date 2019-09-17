package ejerAuto;


/*
 * El objetivo del ejemplo es poder crear un objeto Auto (este ser�a nuestro producto). 
 * El auto se compondr� de varios atributos que lo componen: 
 * motor, marca, modelo y cantidad de puertas. 
 * En nuestro ejemplo, el auto no se compone de muchos objetos complejos. 
 * De hecho, se compone de s�lo 4 objetos relativamente sencillos. 
 * Esto es para poder hacer entendible la propuesta del Builder y no perderse en los objetos que lo componen. 
 * Queda en la imaginaci�n del lector la posibilidad de trabajar con ejemplos m�s complejos. 
 * Yo particularmente us� mucho este patr�n cuando trabaj� con archvios.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoDirector director = new AutoDirector();
		director.setAutoBuilder(new FordBuilder());
		director.constructAuto();
		Auto auto = director.getAuto();
		
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
	}

}

package ejerAuto;


/*
 * El objetivo del ejemplo es poder crear un objeto Auto (este sería nuestro producto). 
 * El auto se compondrá de varios atributos que lo componen: 
 * motor, marca, modelo y cantidad de puertas. 
 * En nuestro ejemplo, el auto no se compone de muchos objetos complejos. 
 * De hecho, se compone de sólo 4 objetos relativamente sencillos. 
 * Esto es para poder hacer entendible la propuesta del Builder y no perderse en los objetos que lo componen. 
 * Queda en la imaginación del lector la posibilidad de trabajar con ejemplos más complejos. 
 * Yo particularmente usé mucho este patrón cuando trabajé con archvios.
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

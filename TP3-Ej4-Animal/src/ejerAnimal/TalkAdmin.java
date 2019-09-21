package ejerAnimal;

public class TalkAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		hacerHablar(gato);
		Perro perro = new Perro();
		hacerHablar(perro);
		RelojCucu relojCucu = new RelojCucu();
		//relojCucu.habla();
		hacerHablar(relojCucu);
	}
	
	//El parametro que recibe es una Interfaz con una clase abstract
	public static void hacerHablar(Hablador sujeto) {
		sujeto.habla();
	}

}

package ejerContenedor;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
	
	List<Articulo> articulos = new ArrayList<Articulo>();
	
	public float getPeso() {
		float total = 0;
		for(Articulo art: articulos) {
			total += art.getPeso();
		}
		return total;
	}
	
	public float getValor() {
		float total = 0;
		for(Articulo art: articulos) {
			art.getValor();
		}
		return total;
	}
}

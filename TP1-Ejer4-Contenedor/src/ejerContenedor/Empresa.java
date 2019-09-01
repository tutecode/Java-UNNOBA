package ejerContenedor;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	List<Contenedor> contenedores = new ArrayList<Contenedor>();
	
	public float pesoArticulo(Articulo art) {
		return art.getPeso();
	}
	
	public float getPeso(Contenedor c) {
		return c.getPeso();
	}
	
	public float pesoContenedor() {
		float total = 0;
		for(Contenedor c: contenedores) {
			total += c.getPeso();
		}
		return total;
	}
	
	public float valorArticulos(Contenedor c) {
		return c.getValor();
	}
	
	public float valorTodosLosArticulos() {
		float total = 0;
		for(Contenedor c: contenedores) {
			total += c.getValor();
		}
		return total;
	}
	
}

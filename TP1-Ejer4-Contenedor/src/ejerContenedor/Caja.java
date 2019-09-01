package ejerContenedor;

import java.util.ArrayList;
import java.util.List;

public class Caja extends Articulo{

	List<Simple> simples = new ArrayList<Simple>();
	
	@Override
	public float getPeso() {
		// TODO Auto-generated method stub
		float total = 0;
		for(Simple art: simples) {
			total += art.getPeso();
		}
		return total;
	}

	@Override
	public float getValor() {
		// TODO Auto-generated method stub
		float total = 0;
		for(Simple art: simples) {
			total += art.getValor();
		}
		return total;
	}

	

}

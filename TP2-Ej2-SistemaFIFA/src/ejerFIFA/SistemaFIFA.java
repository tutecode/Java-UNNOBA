package ejerFIFA;

import java.util.ArrayList;
import java.util.List;

public class SistemaFIFA {
	List<Partido> partidos = new ArrayList<Partido>();
	
	//Agrega un partido a la colección de partidos que tiene el sistema.
	public void agregarPartido(Equipo local, Equipo visitante, Estadio estadio, int valorEntrada) {
		partidos.add(new Partido(local, visitante, estadio, valorEntrada));
	}
	
	//Retorna el estadio con mayor capacidad de espectadores
	public Estadio estadioConMayorCapacidad() {
		int mayor = 0;
		Estadio mayorEstadio = null;
		
		for(Partido p: partidos) {
			if(p.totalEspectadores() > mayor) {
				mayorEstadio = p.getEstadio();
			}
		}
		return mayorEstadio;
	}
	
	//Retorna la suma de todos los espectadores de todos los partidos. 
	//Es decir, la suma de la capacidad de cada estadio de cada partido.
	public int cantidadTotalEspectadores() {
		int total = 0;
		
		for(Partido p: partidos) {
			total += p.totalEspectadores();
		}
		return total;
	}; 
	
	//Retorna la suma recaudada en el partido que se pasa como parámetro.
	public int montoRecaudado(Partido partido) {
		return partido.recaudado();
	}

	//Retorna la suma total recaudada por todos los partidos del mundial
	public int montoTotalRecaudado() {
		int total = 0;
		
		for(Partido p: partidos) {
			total += p.recaudado();
		}
		return total;
	}
}

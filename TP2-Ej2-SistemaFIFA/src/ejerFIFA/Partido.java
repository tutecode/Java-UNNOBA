package ejerFIFA;

public class Partido {
	private Equipo local;
	private Equipo visitante;
	private Estadio estadio;
	private int valorEntrada;
	
	public Partido(Equipo local, Equipo visitante, Estadio estadio, int valorEntrada) {
		// TODO Auto-generated constructor stub
		this.setLocal(local);
		this.setVisitante(visitante);
		this.estadio = estadio;
		this.valorEntrada = valorEntrada;
	}
	
	//Se supone que TODOS los partidos son a estadio lleno.
	public int totalEspectadores() {
		return estadio.getCapacidad();
	}

	//Retorna el estadio
	public Estadio getEstadio() {
		// TODO Auto-generated method stub
		return estadio;
	}
	
	//Retorna el total recaudado
	public int recaudado() {
		return (totalEspectadores() * valorEntrada);
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

}

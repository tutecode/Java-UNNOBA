package ejerDiasSemana;

public enum DiasSemana {
	LUNES(true), MARTES(true), MIERCOLES(true), JUEVES(true), VIERNES(true), SABADO(false), DOMINGO(false);

	private boolean esLaborable;
	
	private DiasSemana(boolean esLaborable) {
		this.esLaborable = esLaborable;
	}
	
	@Override
	public String toString() {
		if(esLaborable) {
			return ("El dia " + this.name().toLowerCase() + " es laborable");
		}
		else {
			return ("El dia " + this.name().toLowerCase() + " no es laborable");

		}
	}
}

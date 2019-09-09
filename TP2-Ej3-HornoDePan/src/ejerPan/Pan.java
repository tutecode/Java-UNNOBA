package ejerPan;

public abstract class Pan {
	private int medidaGrano;

	public Pan(int medidaGrano) {
		setMedidaGrano(medidaGrano);
	}
	
	//Tipo de Pan
	public abstract String getTipoDePan();
	//Comprobar la temperatura
	public abstract float getTemperatura();
	//Preparar agua con sal
	public abstract String getAguaConSal();
	//Preparar la levadura
	public abstract String getLevadura();
	//Añadir el agua y mezclar
	public abstract String getAguaYMezclar();
	//Añadir la harina y remover
	public abstract String getHarinaYRemover();
	//Amasar
	public abstract String getAmasar();
	//Dejar reposar
	public abstract String getReposar();
	//Cortar la masa
	public abstract String getCortarLaMasa();
	//Llevar al horno
	public abstract String getHorno();
	
	
	public int getMedidaGrano() {
		return medidaGrano;
	}

	public void setMedidaGrano(int medidaGrano) {
		this.medidaGrano = medidaGrano;
	}
	
	
}

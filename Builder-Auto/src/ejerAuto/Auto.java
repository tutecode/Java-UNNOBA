package ejerAuto;

public class Auto {
	private int cantidadDePuertas;
	private String modelo;
	private	String marca;
	private	Motor motor;
	
	public int getCantidadDePuertas() {
		return cantidadDePuertas;
	}
	
	public void setCantidadDePuertas(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setMotor(Motor motor) {
		// TODO Auto-generated method stub
		this.motor = motor;
	}
}

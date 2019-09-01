package ejerVehiculo;

public class Vehiculo {
	//Atributos
	private String marca;
	private String modelo;
	private float precio;
	
	//Metodo Constructor (Vehiculo)
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//Metodos
	public float getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return ("Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio);
	}
	
	
}

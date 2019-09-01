package ejerVehiculo;

import java.util.Scanner;

/*
 * Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, 
 * imprima las propiedades del vehículo más barato.
 * Para ello, se deberán leer por teclado las características de cada vehículo y 
 * crear una clase que represente a cada uno de ellos.
 */

public class Main {
	private static Scanner entrada;

	
	public static int vehiculoMasBarato(Vehiculo coches[]) {
		float precio;
		int cocheBarato = 0;
		
		precio = coches[0].getPrecio();
		for(int i = 1; i < coches.length; i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				cocheBarato = i;
			}
		}
		return cocheBarato;
	}
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		String marca, modelo;
		float precio;
		int cantVehiculos, masBarato;
		
		System.out.print("Digite la cantidad de vehiculos: ");
		cantVehiculos = entrada.nextInt();
		
		//Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo[cantVehiculos];
		
		for(int i = 0; i < coches.length; i++) {
			entrada.nextLine();
			System.out.println("\nDigite los datos del coche " + (i+1) + ":");
			
			System.out.print("Introduzca marca: ");
			marca = entrada.nextLine();
			System.out.print("Introduzca modelo: ");
			modelo = entrada.nextLine();
			System.out.print("Introduzca precio: ");
			precio = entrada.nextFloat();
			
			coches[i] = new Vehiculo(marca, modelo, precio);	
		}
		masBarato = vehiculoMasBarato(coches);
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[masBarato].mostrarDatos());
	}
}

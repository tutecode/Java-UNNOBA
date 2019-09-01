package ejerAtleta;

import java.util.Scanner;

/*
 * Construir un programa para una competencia de atletismo, 
 * el programa debe gestionar una serie de atletas caracterizados por su 
 * número de atleta, nombre y tiempo de carrera, 
 * al final el programa debe mostrar los datos del atleta ganador de la carrera.
 * 
 */

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		String nombre;
		int numero, cantAtletas, ganador;
		float tiempo;
		
		//Crear array de atletas
		System.out.print("Digite la cantidad de atletas: ");
		cantAtletas = entrada.nextInt();
		Atleta atletas[] = new Atleta[cantAtletas];
		
		//Ingresar datos de atletas
		for(int i=0; i < atletas.length; i++) {
			entrada.nextLine();
			System.out.println("\nDigite los datos del atleta " + (i+1) + ":");
			
			System.out.print("Introduzca nombre: ");
			nombre = entrada.nextLine();
			System.out.print("Introduzca numero: ");
			numero = entrada.nextInt();
			System.out.print("Introduzca tiempo: ");
			tiempo = entrada.nextFloat();
			
			atletas[i] = new Atleta(nombre, numero, tiempo);
		}
		ganador = atletaGanador(atletas);
		System.out.println("\nEl atleta ganador es:");
		System.out.println(atletas[ganador].mostrarDatos());
	}
	
	//Retorna el atleta ganador
	public static int atletaGanador(Atleta atletas[]) {
		float tiempo;
		int atletaGanador = 0;
		
		//Inicializo el tiempo con el primer atleta
		tiempo = atletas[0].getTiempo();
		
		//Comparar los tiempos del atleta
		for(int i = 1; i < atletas.length; i++) {
			if(atletas[i].getTiempo() < tiempo) {
				tiempo = atletas[i].getTiempo();
				atletaGanador = i;
			}
		}
		return atletaGanador;
	}
}

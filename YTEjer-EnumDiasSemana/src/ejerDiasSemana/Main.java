package ejerDiasSemana;

import java.util.Scanner;

/*
   22. Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).
   23. Modifica el anterior enum para indicar que es día laborable directamente (usar toString).
 */

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.print("Escribe dia de la semana: ");
		String dia = entrada.next();
		
		DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
		
		System.out.println(diaS.toString());
	}
}

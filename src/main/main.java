package main;
import java.util.Scanner;

import utils.PilaEstatica;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserte el valor de N: ");
		Integer tamañoPila = Integer.parseInt(scanner.nextLine());
		
		PilaEstatica pilita = new PilaEstatica(tamañoPila);
		//System.out.println(pilita.tamañoPorDefecto);
	
		/*pilita.insertar("Daniel");
		pilita.insertar("Manuel");
		pilita.insertar("Pikachu");
		pilita.insertar("Iki");
		pilita.insertar("Alvin");
		pilita.insertar("Jorge");
		pilita.insertar("Goku");
		
		System.out.println(pilita.eliminar());
		System.out.println(pilita.eliminar());
		*/
		Integer menorTamaño = 100000;
		String menorString = "";
		
		for(int i = 0; i < tamañoPila; i++) {
			String nombre = scanner.nextLine();
			pilita.insertar(nombre);
		}
		
		while(!pilita.estaVacio()) {
			
			String nombreCorto = "";
			nombreCorto = pilita.eliminar();
			if(nombreCorto.length() < menorTamaño) {
				menorTamaño = nombreCorto.length();
				menorString = nombreCorto;
			}
			
		}
		
		System.out.println(menorString);
					
	}

}

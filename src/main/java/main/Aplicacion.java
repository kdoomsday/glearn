package main;

import java.util.Scanner;

import geometria.Circulo;
import geometria.Punto;

public class Aplicacion {
	private static Scanner scan;
	
	public static void main(String[] args) {
		int x, y, radio;
		scan = new Scanner(System.in);
		
		x = readEntero("X: ");
		y = readEntero("Y: ");
		radio = readEntero("Radio: ");
		
		Circulo c = new Circulo(new Punto(x, y), radio);
		System.out.println("El area es: " + c.area());
	}
	
	/**
	 * Obtener un entero de la consola
	 * @param prompt Qu&eacute; se imprime para solicitar el entero
	 * @return El entero le&iacute;do
	 */
	private static int readEntero(String prompt) {
		System.out.print(prompt);
		return scan.nextInt();
	}
}

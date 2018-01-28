package geometria;
/**
 * 
 * @author g33k09
 *
 */
public class Cuadrado {
	private final Punto centro;
	private final int lados;
/**
 * Calcula el area de un cuadrado
 * @return un entero con el area
 */
	public int area() {
		return lados * lados;
	}

	public Cuadrado(Punto centro, int lados) {
		super();
		this.centro = centro;
		this.lados = lados;
	}

	public Punto getCentro() {
		return centro;
	}

	public int getLados() {
		return lados;
	}

}

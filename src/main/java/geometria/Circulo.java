package geometria;
/**
 * Define un circulo
 * @author g33k09
 *
 */
public class Circulo implements FiguraGeometrica {
	private final Punto centro;
	private final int radio;
/**
 * Calcula el area de un círculo
 * @return un double con el area
 */
	public double area() {
		return Math.PI * radio * radio;
	}

	public Circulo(Punto centro, int radio) {
		super();
		this.centro = centro;
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public int getRadio() {
		return radio;
	}
}

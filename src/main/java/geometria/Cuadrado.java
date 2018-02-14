package geometria;
/**
 * 
 * @author g33k09
 *
 */
public class Cuadrado implements FiguraGeometrica {
	private final Punto esquina;
	private final int lados;
/**
 * Calcula el area de un cuadrado
 * @return un entero con el area
 */
	public double area() {
		return lados * lados;
	}

	public Cuadrado(Punto esquina, int lados) {
		super();
		this.esquina = esquina;
		this.lados = lados;
	}

	public Punto getEsquina() {
		return esquina;
	}

	public int getLados() {
		return lados;
	}

}

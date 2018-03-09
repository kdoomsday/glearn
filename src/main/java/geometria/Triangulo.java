package geometria;

/**
 * Define un triángulo
 * 
 * @author g33k09
 *
 */
public class Triangulo implements FiguraGeometrica {
	private final Punto puntoA, puntoB, puntoC;

	public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.puntoC = puntoC;
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public Punto getPuntoC() {
		return puntoC;
	}

	public double area() {
		double aX = getPuntoA().getX();
		double aY = getPuntoA().getY();
		double bX = getPuntoB().getX();
		double bY = getPuntoB().getY();
		double cX = getPuntoC().getX();
		double cY = getPuntoC().getY();
		return Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
	}

}

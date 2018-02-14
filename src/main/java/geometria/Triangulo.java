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
		double Ax = getPuntoA().getX();
		double Ay = getPuntoA().getY();
		double Bx = getPuntoB().getX();
		double By = getPuntoB().getY();
		double Cx = getPuntoC().getX();
		double Cy = getPuntoC().getY();
		return Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2);
	}

}

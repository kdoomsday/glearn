package geometria;

public class Triangulo {
	private Punto PuntoA, PuntoB, PuntoC = new Punto(0, 0);
	private int BaseT;
	private int AlturaT;

	public Triangulo(Punto P1, Punto P2, Punto P3, int b, int a) {
		BaseT = b;
		AlturaT = a;
		PuntoA = P1;
		PuntoB = P2;
		PuntoC = P3;
	}

	public double AreaT() {
		int Area = BaseT * AlturaT / 2;
		return Area;

	}
}

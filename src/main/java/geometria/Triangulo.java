package geometria;

public class Triangulo {
	private Punto CentroT = new Punto(0, 0);
	private int BaseT;
	private int AlturaT;

	public Triangulo(int b, int a) {
		BaseT = b;
		AlturaT = a;
	}

	public double AreaT() {
		int Area = BaseT * AlturaT / 2;
		return Area;

	}
}

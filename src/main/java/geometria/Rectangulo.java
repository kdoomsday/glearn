package geometria;

public class Rectangulo {
	private Punto CentroR = new Punto(0, 0);
	private int BaseR;
	private int AlturaR;

	public Rectangulo(int b, int a) {
		BaseR = b;
		AlturaR = a;
	}

	public int AreaR() {
		int Area = BaseR * AlturaR;
		return Area;
	}

}

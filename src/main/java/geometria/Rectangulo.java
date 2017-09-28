package geometria;

public class Rectangulo {
	private Punto CentroR = new Punto(0, 0);
	private int BaseR;
	private int AlturaR;

	public Rectangulo(Punto Centro, int b, int a) {
		BaseR = b;
		AlturaR = a;
		this.CentroR = Centro;

	}

	public int AreaR() {
		int Area = BaseR * AlturaR;
		return Area;
	}

}

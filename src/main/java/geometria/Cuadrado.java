package geometria;

public class Cuadrado {
	private Punto CentroCu = new Punto(0, 0);
	private int lados;

	public Cuadrado(int l) {
		lados = l;
	}

	public int AreaCu() {
		int Area = lados * lados;
		return Area;
	}

}

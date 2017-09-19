package geometria;

public class Circulo {
	private Punto CentroC = new Punto(0, 0);
	private int radio;

	public Circulo(int r) {
		radio = r;
	}

	public double AreaCi() {
		Double Area = Math.PI * Math.pow(radio, 2);
		return Area;
	}
}

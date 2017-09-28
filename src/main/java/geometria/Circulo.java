package geometria;

public class Circulo {
	private Punto CentroC = new Punto(0, 0);
	private int radio;

	public Circulo(Punto Centro, int r) {
		CentroC = Centro;
		radio = r;
	}

	public double AreaCi() {
		double Area = Math.PI * Math.pow(radio, 2);
		return Area;
	}
}

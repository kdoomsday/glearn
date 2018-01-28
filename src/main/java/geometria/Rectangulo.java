package geometria;

public class Rectangulo {
	private final Punto centro;
	private final int base;
	private final int altura;

	public int area() {
		return base * altura;
	}

	public Rectangulo(Punto centro, int base, int altura) {
		super();
		this.centro = centro;
		this.base = base;
		this.altura = altura;

	}

	public Punto getCentro() {
		return centro;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

}

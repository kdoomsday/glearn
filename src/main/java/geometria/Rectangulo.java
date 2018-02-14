package geometria;

public class Rectangulo implements FiguraGeometrica {
	private final Punto esquina;
	private final int base;
	private final int altura;

	public double area() {
		return base * altura;
	}

	public Rectangulo(Punto esquina, int base, int altura) {
		super();
		this.esquina = esquina;
		this.base = base;
		this.altura = altura;

	}

	public Punto getEsquina() {
		return esquina;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

}

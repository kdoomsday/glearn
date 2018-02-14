package geometria;

/**
 * Extiende de cuadrado y agrega colores
 * @author g33k09
 * 
 */
import java.awt.Color;

public class CuadradoColor extends Cuadrado {
	private Color c;

	public CuadradoColor(Punto esquina, int lados, Color c) {
		super(esquina, lados);
		this.c = c;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

}

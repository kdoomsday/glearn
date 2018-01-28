package main;

import static org.junit.Assert.*;

import org.junit.Test;
import geometria.Cuadrado;
import geometria.Triangulo;
import geometria.Rectangulo;
import geometria.Circulo;
import geometria.Punto;

public class TestGeometria {

	@Test
	public void testAreaCirculo() {
		Circulo c = new Circulo(new Punto(5, 7), 8);
		assertEquals(c.area(), 201.061, 201);

	}

	@Test
	public void testAreaCuadrado() {
		Cuadrado c = new Cuadrado(new Punto(8, 5), 6);
		assertEquals(c.area(), 36);
	}
	@Test
	public void testAreaRectangulo() {
		Rectangulo r = new Rectangulo(new Punto(7, 9), 4, 8);
		assertEquals(r.area(), 32);

	}
	@Test
	public void testAreaTriangulo() {
		Triangulo t = new Triangulo(new Punto(7,8), new Punto(5,9), new Punto(3,5) );
		assertEquals(t.area(),5.00, 5);
	}
}

package basic;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import geometria.Circulo;
import geometria.Cuadrado;
import geometria.CuadradoColor;
import geometria.Rectangulo;
import geometria.Triangulo;
import geometria.AreaTotal;
import geometria.FiguraGeometrica;
import geometria.Punto;

public class AreaTotalTest {

	@Test
	public void TestArea() {
		FiguraGeometrica a0 = new Circulo(null, 8);
		FiguraGeometrica a1 = new Circulo(null, 9);
		FiguraGeometrica a2 = new Cuadrado(null, 10);
		FiguraGeometrica a3 = new Cuadrado(null, 11);
		FiguraGeometrica a4 = new CuadradoColor(null, 7, null);
		FiguraGeometrica a5 = new CuadradoColor(null, 6, null);
		FiguraGeometrica a6 = new Rectangulo(null, 5, 4);
		FiguraGeometrica a7 = new Rectangulo(null, 3, 4);
		FiguraGeometrica a8 = new Triangulo(new Punto(8, 9), new Punto(5, 3), new Punto(2, 1));
		FiguraGeometrica a9 = new Triangulo(new Punto(8, 7), new Punto(4, 6), new Punto(2, 3));
		List<FiguraGeometrica> a = new ArrayList<>();
		a.add(a0);
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		a.add(a6);
		a.add(a7);
		a.add(a8);
		a.add(a9);
		assertEquals(AreaTotal.areaTotal(a), 804.53, 1.00);

	}
}

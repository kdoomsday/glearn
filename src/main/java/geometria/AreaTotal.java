package geometria;

import java.util.List;

/**
 * Calcula el Area Total de una lista de Figuras
 * 
 * @author g33k09
 * 
 */

public class AreaTotal {
	public static double areaTotal(List<FiguraGeometrica> sum) {
		double suma = 0;
		for (FiguraGeometrica area : sum) {
			suma = suma + area.area();
		}
		return suma;

	}

}

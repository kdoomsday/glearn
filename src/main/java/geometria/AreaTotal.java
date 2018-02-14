package geometria;

/**
 * Calcula el Area Total de una lista de Figuras
 * @author g33k09
 * 
 */
import java.util.List;

public class AreaTotal {
	public static double areaTotal(List<FiguraGeometrica> sum) {
		double suma = 0;
		for (int i = 0; i < sum.size(); i++) {
			suma = suma + sum.get(i).area();
		}
		return suma;

	}

}

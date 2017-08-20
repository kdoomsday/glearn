package basic;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManejoListasTest {

    @Test
    public void testMaximo() {
        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        assertEquals("El máximo inicial es 3", 3, ManejoListas.maximo(valores));

        valores.add(42);
        valores.add(42);
        valores.add(41);
        valores.add(2);
        valores.add(4);
        assertEquals("El máximo es 42", 42, ManejoListas.maximo(valores));

        List<Integer> valores2 = new ArrayList<>();
        valores2.add(-100);
        valores2.add(-10);
        valores2.add(-1);
        assertEquals("El máximo es -1", -1, ManejoListas.maximo(valores2));
    }

    @Test
    public void testSuma() {
        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        assertEquals("Suma inicial", 6, ManejoListas.suma(valores));

        valores.add(100);
        valores.add(100);
        valores.add(100);
        assertEquals("Suma con 100s", 306, ManejoListas.suma(valores));

        valores.add(-306);
        assertEquals("Suma con negativos", 0, ManejoListas.suma(valores));
    }

    @Test
    public void testNombreMasLargo() {
        List<String> nombres = new ArrayList<>();
        assertEquals("Nombre mas largo de lista vacía", "", ManejoListas.nombreMasLargo(nombres));

        nombres.add("Gabriel");
        assertEquals("Nombre mas largo de un solo elemento", "Gabriel", ManejoListas.nombreMasLargo(nombres));

        nombres.add("María");
        assertEquals("Nombre mas largo con mas de un elemento", "Gabriel", ManejoListas.nombreMasLargo(nombres));

        nombres.add("Eduardo");
        assertEquals("Nombre mas largo con elementos de misma longitud", "Gabriel", ManejoListas.nombreMasLargo(nombres));

        nombres.add("María del Pilar y Algo más");
        assertEquals("Nombre mas largo con elementos de misma longitud", "María del Pilar y Algo más", ManejoListas.nombreMasLargo(nombres));
    }
}

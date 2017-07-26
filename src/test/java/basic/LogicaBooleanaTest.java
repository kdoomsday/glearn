package basic;

import org.junit.Test;

import static org.junit.Assert.*;

/** Pruebas unitarias de la clase LogicaBooleana */
public class LogicaBooleanaTest {

    @Test
    public void testIgual() {
        assertTrue(LogicaBooleana.igual(1, 1));
        assertTrue(LogicaBooleana.igual(3, 3));
        assertTrue(LogicaBooleana.igual(-1, -1));
        assertTrue(LogicaBooleana.igual(12345, 12345));
        assertTrue(LogicaBooleana.igual(0, 0));

        assertFalse(LogicaBooleana.igual(0, 1));
        assertFalse(LogicaBooleana.igual(2, 1));
        assertFalse(LogicaBooleana.igual(1, 2));
        assertFalse(LogicaBooleana.igual(1, -1));
    }

    @Test
    public void testDespertarseTarde() {
        assertTrue(LogicaBooleana.despertarseTarde(false, true));
        assertTrue(LogicaBooleana.despertarseTarde(true, true));
        assertTrue(LogicaBooleana.despertarseTarde(false, false));

        assertFalse(LogicaBooleana.despertarseTarde(true, false));
    }

    @Test
    public void testCercanoA100() {
        assertTrue(LogicaBooleana.cercanoA100(99, 10));
        assertTrue(LogicaBooleana.cercanoA100(101, 10));
        assertTrue(LogicaBooleana.cercanoA100(101, 1));
        assertTrue(LogicaBooleana.cercanoA100(99, 1));

        assertTrue(LogicaBooleana.cercanoA100(50, 75));

        assertFalse(LogicaBooleana.cercanoA100(50, 10));
        assertFalse(LogicaBooleana.cercanoA100(90, 1));
        assertFalse(LogicaBooleana.cercanoA100(107, 8));
    }
}

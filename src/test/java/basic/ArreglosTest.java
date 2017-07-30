package basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArreglosTest {

  @Test
  public void testSiguientesTres() {
    int[] valores = Arreglos.siguientesTres(0);
    assertEquals(3, valores.length);
    assertEquals(0, valores[0]);
    assertEquals(1, valores[1]);
    assertEquals(2, valores[2]);
  }

  @Test
  public void testRepetir() {
      String[] resultado = Arreglos.repetir("Eduardo", 10);
      assertEquals(10, resultado.length);
      for (int i=0; i < 10; i++) {
        assertEquals("Eduardo", resultado[i]);
      }
  }

  @Test
  public void testIgual() {
    int[] a = { 1, 2, 3 };
    int[] b = { 4, 5, 6 };

    assertEquals(a, a);
    assertNotEquals(a, b);
  }
}

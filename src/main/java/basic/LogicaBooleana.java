package basic;

/**
 * Implementar algunos ejercicios de lógica booleana para comenzar a practicar
 *
 * La parte básica a recordar en este ejercicio es que en lógica booleana hay
 * sólo dos valores posibles: verdadero (true) y falso (false).
 *
 * Hay 3 operaciones básicas que podemos hacer para combinar operaciones
 * booleanas:
 * - Y:  entiéndase por ejemplo como alto Y gordo. En java el operador es &&
 *       A && B == true si tanto A como B son true
 * - O:  ejemplo, está al norte O al oeste. En Java el operador es ||
 *       A || B == true si al menos uno de los dos lo es.
 * - No: Negar algo, por ejemplo, No es alto. En Java es !
 *       !A == true si A == false
 *
 * Hay algunas otras cosas que dan resultados true o false también. Por ejemplo,
 * se pueden comparar números entre sí para determinar propiedades. Para estos
 * ejercicios vamos a usar algo de esto. En los ejemplos a continuación, las
 * letras son int:
 * - x == y si x es exactamente igual a y
 * - x > y si x es mayor que y
 * - x < y si x es menor que y
 * - x >= y si x es mayor que y o x es igual a y
 * - x <= y si x es menor que y o x es igual a y
 *
 * La forma como está estructurado este ejercicio es que voy a definir algunas
 * funciones, y hacer que devuelvan un valor por defecto. Voy a escribir
 * también pruebas unitarias de todas las funciones. Deberías correr las pruebas
 * unitarias (con 'mvn test' o ejecutando con tu IDE) y lograr que todas pasen.
 */
public class LogicaBooleana {
    /**
     * Este es una función de muestra. Esto es un comentario, que debería
     * explicar qué hace la función. En este caso es una función que dice
     * si dos números enteros son iguales
     * @param x El primer número
     * @param y El segundo número
     * @return  Si ambos números son exactamente iguales.
     */
    public static boolean igual(int x, int y) {
        return x == y;
    }

    /**
     * Determina si se puede uno despertar tarde.
     * @param esDiaDeSemana Si el día actual es un día de semana
     * @param vacaciones    Si estamos de vacaciones
     * @return Verdadero si no es un día de semana o estamos de vacaciones
     */
    public static boolean despertarseTarde(boolean esDiaDeSemana, boolean vacaciones) {
        return false;
    }

    /**
     * Determina si un número es cercano a 100. Decimos que es cercano a 100 si
     * la diferencia entre el número y 100 está dentro del margen
     * @param n      El número que estamos evaluando
     * @param margen El margen de diferencia que aceptamos entre 100 y el número
     * @return       Si el número es suficientemente cercano a 100.
     */
    public static boolean cercanoA100(int n, int margen) {
        return false;
    }
}

package basic;
import java.util.ArrayList;
/**
 * Ya viste un poco de lógica booleana, ahora vamos a ver cómo trabajar con
 * múltiples elementos de un mismo tipo. Según entiendo ya tienes claro la parte
 * básica de ints, booleans, String, etc. de manera que lo voy a saltar.
 * En caso de que haga falta hacemos un pedazo de eso.
 *
 * Cuando quieres trabajar con valores, declaras una variable del tipo, le
 * asignas valores, utilizas el valor para tomar decisiones, y demás. Todo eso
 * funciona bien, pero a veces necesitas 100 ints, por ejemplo, y no vas a
 * declarar 100 variables diferentes. A veces necesitas trabajar con esos 100
 * y realizar una operación igual a todos, necesitas compararlos entre ellos,
 * o necesitas varios, pero no sabes cuántos. Para todos estos casos usas
 * arreglos
 *
 * Para declarar un arreglo utilizamos []. Por ejemplo:
 * int[] edades = new int[10];
 * Esto declara un arreglo de int con 10 posiciones para almacenar datos. No
 * tienes datos todavía, pero tienes 10 posiciones para asignar.
 *
 * Para asignar un valor seleccionas la posición por número (empezando en 0).
 * Para usar el valor es igual. Por ejemplo:
 * edades[0] = 20;
 * edades[1] = 10;
 * if (edades[0] > 18) {
 *     System.out.println("Es mayor de edad");
 * }
 *
 * Como empiezan en 0, la última posición es el tamaño menos 1.
 * Para ver el tamaño de un arrglo usamos la propiedad "size". Siguiendo el
 * ejemplo anterior:
 * edades.size == 10
 *
 * Para trabajar con arreglos ayuda usar loops. Hay tres tipos básicos de loop:
 * - while
 * - do while
 * - for
 *
 * Todos necesitan una condición booleana para saber hasta cuándo hacer las
 * cosas. Unos ejemplos son los siguientes:
 * while (diaDeSemana) { trabajar(); }
 * do { salirAJugar(); } while (finDeSemana);
 * for (int i=0; i < 10; i++) { System.out.println(i + " <-"); }
 *
 * While hace una cosa MIENTRAS la condición se cumple. Si la condición es false
 * al comienzo nunca la ejecuta.
 *
 * Do ... while hace algo al menos una vez, y luego mientras se cumpla la
 * condición.
 *
 * For se usa para ejecutar algo un número definido de veces.
 * Para hacer una cosa 3 veces, puedes hacer:
 * for (int i=0; i < 3; i++) {
 *     // lo que quieras hacer
 * }
 *
 * El for tiene tres secciones dentro de los paréntesis:
 * - Inicialización: Sirve para inicializar una variable que se puede usar
 *   dentro del for.
 * - Condición: Ejecutar mientras esto se cumpla
 * - Incremento: Una acción a ejecutar al final de la iteración, antes de evaluar
 *   la condición para ver si se sigue ejecutando
 *
 * En el ejemplo anterior la inicialización asigna 0 a una variable llamada i.
 * La condición revisa que i sea menor que 3. El incremento le suma 1 a i cada
 * vez.
 *
 * El for NO ejecuta si la condición nunca es verdadera
 */
public class Arreglos {
    /**
     * Obtener los siguientes 3 enteros al inicial.
     * @param inicial Número en el que se empieza
     * @return Un arreglo de 3 posiciones con el inicial, inicial + 1 e
     *         inicial + 2
     */
    public static int[] siguientesTres(int inicial) {
    	int[] valor = new int[3];
    	for(inicial=0; inicial<3; inicial++) {
    	valor[inicial] = inicial;
    	}
		return valor;


    }


    /**
     * Repetir una cadena un cierto número de veces.
     *
     * Avísame si no has visto esto, para revisarlo.
     *
     * @param cadena Cadena a repetir
     * @param veces  Número de veces que se debe repetir. Debe ser >= 0
     * @return Un arreglo de tamaño "veces" con "cadena" en todas las posiciones
     */
    public static String[] repetir(String cadena, int veces) {
    	String[] repetido = new String[10];
    	for(veces=0; veces<10; veces++) {
    	repetido[veces] = cadena;
    	}
      return repetido;
    }

    /**
     * Determinar si dos arreglos son iguales (mismo tamaño y elementos)
     * @param primero Primer arreglo
     * @param segundo Segundo arreglo
     * @return Si el primer arreglo y el segundo son idénticos
     */
    public static boolean iguales(int[] primero, int[] segundo) {
      return false;

    }

}

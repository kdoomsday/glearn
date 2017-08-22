package basic;

import java.util.List;
import java.util.ArrayList;

/**
 * Ahora vamos a trabajar con colecciones más generales.
 * Casi nunca quieres trabajar con arreglos directamente, porque es más complicado
 * y te expones a algunos problemas innecesarios.
 *
 * Las colecciones de elementos más utilizadas normalmente son List, Stack, Set
 * y Map. Hoy nos vamos a concentrar en las listas, y más adelante vemos para qué
 * sirve lo demás.
 *
 * Una lista se parece a un arreglo en el sentido de que es varios elementos
 * guardados de forma secuencial. Sin embargo tienen algunas diferencias. Por
 * ejemplo, los arreglos necesitan un tamaño inicial y nunca pueden crecer o
 * encogerse. Las listas crecen a medida que les vas agregando elementos.
 * Algunas de las demás diferencias las vamos a ver a continuación.
 *
 * Para declarar una lista lo haces de la siguente manera (no te preocupes
 * demasiado de por qué es así. Los detalles los vemos después)
 *
 * <code>List<String> nombres = new ArrayList<>();</code>
 *
 * Esto declara una nueva lista de Strings. No puedes agregar sino Strings a
 * la lista, y los elementos que saques de ella van a ser todos String.
 * Para agregar un elemento usas el método add(). Por ejemplo:
 *
 * <code>nombres.add("Gabriel")</code>
 *
 * Fíjate que no le dices la posición. La lista sabe que tiene que agregarlo
 * al final. Para obtener un elemento usas get, con el índice igual que en los
 * arreglos. Por ejemplo:
 *
 * <code>nombres.get(0)</code>
 *
 * Como la lista es de String, el resultado del get es un String también y lo
 * puedes usar en cualquier lugar en el que puedes usar un String. Por ejemplo,
 * para comparar, puedes hacer:
 *
 * <code>nombres.get(0).equals("Gabriel");</code>
 *
 * Para ver el tamaño de una lista usas size().
 *
 * Para no complicar demasiado el asunto, vamos a trabajar con estos métodos, y
 * luego podemos ver algunos de los otros que hay.
 */
public class ManejoListas {

    /**
     * Buscar el máximo elemento de una lista de Integers (ints).
     * @param valores La lista de valores en los que se va a buscar. Tienes
     * garantizado que la lista nunca es null y nunca es vacía.
     *
     * @return El máximo valor de los presentes en la lista.
     */
    public static int maximo(List<Integer> valores) {
    	int resultado=valores.get(0);
    	for(int i=1; i<valores.size();i++) {	
    	if(resultado<valores.get(i)) {
    	resultado=valores.get(i);
    		}
    	}
        return resultado;
    }


    /**
     * Obtener la suma de todos los elementos de una lista de enteros
     * @param valores La lista de enteros. Esta puede ser vacía, pero no null
     *
     * @return La suma de los elementos de la lista. Si la lista es vacía, la
     * suma es cero.
     */
    public static int suma(List<Integer> valores) {
        int suma=0;
    	for(int i=0;i<valores.size();i++) {
    		suma= suma+valores.get(i);
    	}
    	
    	return suma;
    }


    /**
     * @param  nombres La lista de nombres en la que se busca. Nunca es null.
     * @return El nombre más largo de la lista, o la cadena vacía ("") si no
     * hay nombres. Si hay más de un nombre empatado por el más largo, debe
     * devolver el primero que consiga.
     */
    public static String nombreMasLargo(List<String> nombres) {
    	String nombre=("");
    	String tamaño_nombre=null;
    	for(int i=0; i<nombres.size();i++) {
    		tamaño_nombre=nombres.get(i);
    		if(nombre.length()<tamaño_nombre.length()) {
    			nombre=tamaño_nombre;
    		}
    	}
    	
        return nombre ;
    }
}

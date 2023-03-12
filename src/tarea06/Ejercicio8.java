/**
 * 
 */
package tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio8 {

	/*
	 * 8. Crea un array de 10 posiciones de números con valores pedidos por teclado.
	 * Muestra por consola el indice y el valor al que corresponde. Haz dos métodos,
	 * uno para rellenar valores y otro para mostrar
	 */

	public void pedirValores() {
		int[] miArray = new int[10];
		System.out.println("Introduce 10 valores para nuestro array:");

		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = Utils.pedirEntero();
		}
		pintarArray(miArray);
	}

	public void pintarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". " + array[i]);
		}
	}
}

/**
 * 
 */
package tarea06;

import java.util.Random;

/**
 * @author Palmira
 *
 */
public class Ejercicio11 {

	/*
	 * 11. Crea dos arrays de números con la dimensión pasada por teclado. Uno de
	 * ellos estará rellenado con números aleatorios y el otro apuntara al array
	 * anterior, reasigna los valores del segundo array con valores aleatorios.
	 * Después, crea un método que tenga como parámetros, los dos arrays y devuelva
	 * uno nuevo con la multiplicación de la posición 0 del array 1 con el array 2 y
	 * asi sucesivamente. Por último, muestra el contenido de cada array.
	 */

	public void arrayRandom() {

		System.out.println("Dime el tamaño de nuestro array:");
		int size = Utils.pedirEntero();
		int[] arrayA = generarArrayRandom(size);
		System.out.println("Array A: ");
		Utils.imprimirArray(arrayA);
		// El arrayB debe apuntar al arrayA
		int[] arrayB = arrayA;
		System.out.println("Array B sin modificar: ");
		Utils.imprimirArray(arrayB);
		// Modificamos el array B con otros números aleatorios
		arrayB = generarArrayRandom(size);
		System.out.println("Array B modificado: ");
		Utils.imprimirArray(arrayB);
		int[] arrayFinal = arrayMultiplicado(arrayA, arrayB);
		System.out.println("Array con los valores multiplicados del Array A y el Array B: ");
		Utils.imprimirArray(arrayFinal);

	}

	public int[] generarArrayRandom(int tamanyo) {
		int[] array = new int[tamanyo];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.generarRandom(1, 100);
		}
		return array;
	}

	public int[] arrayMultiplicado(int[] arrayA, int[] arrayB) {
		int[] arrayMultiplicado = new int[arrayA.length];
		for (int i = 0; i < arrayMultiplicado.length; i++) {
			arrayMultiplicado[i] = arrayA[i] * arrayB[i];
		}
		return arrayMultiplicado;
	}

}

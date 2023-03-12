/**
 * 
 */
package tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio12 {

	/*
	 * Crea un array de números de un tamaño pasado por teclado, el array contendrá
	 * números aleatorios entre 1 y 300 y mostrará aquellos números que acaben en un
	 * dígito que nosotros le indiquemos por teclado(debes controlar que se
	 * introduce un numero correcto), estos deben guardarse en un nuevo array.
	 */
	public static final int MIN = 1;
	public static final int MAX = 300;

	public void generarArray() {
		System.out.println("Dime el tamaño de nuestro array: ");
		int size = Utils.pedirEntero();
		System.out.println("Dinos en que número quieres que acabe nuestro Array: ");
		int numero = Utils.pedirEntero();
		while (!numCorrecto(numero)) {
			System.out.println("Debes introducir un número entre 0-9:");
			numero = Utils.pedirEntero();
		}
		if (numCorrecto(numero)) {
			int[] arrayRandom = generarArrayNumRandom(size, numero, MIN, MAX);
			System.out.println("Nuestro array de números terminados en " + numero);
			Utils.imprimirArray(arrayRandom);
		}
	}

	public int[] generarArrayNumRandom(int size, int digito, int min, int max) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			do {
				array[i] = Utils.generarRandom(min, max);
			} while (!(array[i] % 10 == digito));
		}
		return array;
	}

	public boolean numCorrecto(int num) {
		if (num >= 0 && num < 10) {
			return true;
		} else {
			System.out.println("Error");
			return false;
		}
	}

}

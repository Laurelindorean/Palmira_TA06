/**
 * 
 */
package tarea06;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Utils {
	// Clase creada para que implemente los metodos que podamos reutilizar para
	// hacer los ejercicios

	public static String pedirString() {
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		return palabra;
	}

	public static int pedirEntero() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}

	public static double pedirReal() {
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		return numero;
	}

	public static long pedirLong() {
		Scanner sc = new Scanner(System.in);
		long numero = sc.nextInt();
		return numero;
	}

	public static int generarRandom(int min, int max) {
		Random random = new Random();
		int numRandom = random.nextInt(max - min) + min;
		return numRandom;
	}

	public static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

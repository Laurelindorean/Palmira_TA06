/**
 * 
 */
package tarea06;

import java.util.Random;

/**
 * @author Palmira
 *
 */
public class Ejercicio10 {

	/*
	 * Crea un array de números de un tamaño pasado por teclado, el array contendrá
	 * números aleatorios primos entre los números deseados, por último nos indicará
	 * cual es el mayor de todos. Haz un método para comprobar que el número
	 * aleatorio es primo, puedes hacer todos los métodos que necesites
	 */
	public void pedirArray() {
		System.out.println("Dinos el tamaño de nuestro array");
		int[] miArray = generarArray();
		System.out.println("Este es nuestro array de números primos aleatorios: ");
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
		numeroMayor(miArray);

	}

	public int[] generarArray() {
		int[] miArray = new int[Utils.pedirEntero()];
		Random numRandom = new Random();
		System.out.println("Generaremos un array de números aleatorios entre 2 números de tu elección");
		System.out.println("Dinos el minimo: ");
		int min = Utils.pedirEntero();
		System.out.println("Dinos el maximo: ");
		int max = Utils.pedirEntero();
		for (int i = 0; i < miArray.length; i++) {
			do {
				miArray[i] = Utils.generarRandom(min, max);
				//Reutilizo el metodo del ejercicio 3 para saber si un número es primo
			}while(!Ejercicio3.esPrimo(miArray[i]));
		}
		return miArray;
	}
	
	public void numeroMayor(int[] array) {
		int mayor = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		System.out.println("El número mayor de todos es " + mayor);
	}
}

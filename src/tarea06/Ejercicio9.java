/**
 * 
 */
package tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio9 {

	/*
	 * 9. Crea un array de números donde le indicamos por teclado el tamaño del
	 * array, rellenaremos el array con números aleatorios entre 0 y 9. Al final
	 * muestra por pantalla el valor de cada posición y la suma de todos los
	 * valores. Tareas a realizar: Haz un método para rellenar el array(que tenga
	 * como parámetros los números entre los que tenga que generar) y otro para
	 * mostrar el contenido y la suma del array
	 */
	public static final int MIN = 0;
	public static final int MAX = 9;

	public void pedirArray() {
		System.out.println("Dinos el tamaño de nuestro array:");
		int[] miArray = generarArray(MIN, MAX);
		int suma = 0;
		System.out.println("Mi array aleaotorio es: ");
		for (int i = 0; i < miArray.length; i++) {
			System.out.println((i + 1) + ". " + miArray[i]);
			suma += miArray[i];
		}
		System.out.println("La suma de los valores del array es: " + suma);

	}

	public int[] generarArray(int min, int max) {
		int tamaño = Utils.pedirEntero();
		int[] miArray = new int[tamaño];
		for (int i = 0; i < miArray.length; i++) {
			// reutilizo metodo del ejercicio 2 para generar numeros aleatorios
			miArray[i] = Ejercicio2.generarRandom(min, max);
		}
		return miArray;
	}
}

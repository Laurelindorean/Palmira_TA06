package Tarea06;

public class Ejercicio2 {

	/*
	 * Crea una aplicación que nos genere una cantidad de números enteros aleatorios
	 * que nosotros le pasemos por teclado. Crea un método donde pasamos como
	 * parámetros entre que números queremos que los genere, podemos pedirlas por
	 * teclado antes de generar los números. Este método devolverá un número entero
	 * aleatorio. Muestra estos números por pantalla.
	 */
	public void numerosAleatorios() {

		System.out.println("Escribe cuantos números quieres generar: ");
		int[] numeros = new int[Utils.pedirEntero()];
		System.out.println("Dime el minimo:");
		int min = Utils.pedirEntero();
		System.out.println("Dime el máximo:");
		int max = Utils.pedirEntero();
		System.out.println("Los números aleatorios generados son: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarRandom(min, max);
			System.out.print(numeros[i] + " ");
		}
	}

	public int generarRandom(int min, int max) {
		int rango = max - min + 1;
		int numeroAleatorio = (int) (Math.random() * rango) + min;
		return numeroAleatorio;
	}
}

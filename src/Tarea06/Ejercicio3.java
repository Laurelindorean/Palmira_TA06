/**
 * 
 */
package Tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio3 {

	/*
	 * 3. Crea una aplicación que nos pida un número por teclado y con un método se
	 * lo pasamos por parámetro para que nos indique si es o no un número primo,
	 * debe devolver true si es primo sino false. Un número primo es aquel que solo
	 * puede dividirse entre 1 y si mismo, por ejemplo: 25 no es primo, ya que 25 es
	 * divisible entre 5, sin embargo, 17 si es primo.
	 */
	public void numeroPrimo() {
		System.out.println("Teclea un número y te diré si es primo: ");
		int numero = Utils.pedirEntero();
		if (esPrimo(numero)) {
			System.out.println("El número " + numero + " es primo");
		} else {
			System.out.println("El número " + numero + " no es primo");
		}
	}

	public boolean esPrimo(int num) {
		int contador = 2;
		boolean primo = true;

		while (primo && (contador != num)) {
			if (num % contador == 0 || num <= 1) {
				primo = false;
				contador++;
			} else {
				return primo;
			}
		}
		return primo;
	}

}

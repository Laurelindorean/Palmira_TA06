/**
 * 
 */
package Tarea06;

import java.math.BigInteger;

/**
 * @author Palmira
 *
 */
public class Ejercicio4 {

	/*
	 * 4. Crea una aplicación que nos calcule el factorial de un número pedido por
	 * teclado, lo realizara mediante un método al que le pasamos el número como
	 * parámetro. Para calcular el factorial, se multiplica los números anteriores
	 * hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta
	 * operación 5*4*3*5*1 = 120.
	 */
	public void pedirFactorial() {
		System.out.println("Introduce un número y te calculo el factorial: ");
		int num = Utils.pedirEntero();
		int factorial = factorialRecursivo(num);
		System.out.println("El factorial de " + num + " es: " + factorial );
		
	}


	public int factorialRecursivo(int num) {
			int numero = Math.abs(num);
			if(numero <= 1) {
				return 1;
			}else {
				return num*factorialRecursivo(numero-1);
			}
	}
}

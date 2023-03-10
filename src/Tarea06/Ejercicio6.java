/**
 * 
 */
package Tarea06;

/**
 * @author Palmira
 *
 */
public class Ejercicio6 {

	/*
	 * 6. Crea una aplicación que nos cuente el número de cifras de un número entero
	 * positivo (hay que controlarlo) pedido por teclado. Crea un método que realice
	 * esta acción, pasando el número por parámetro, devolverá el número de cifras.
	 */
	
	public void pedirNumero() {
		System.out.println("Dime un número entero positivo:");
		int numero = Utils.pedirEntero();
		while(numero<0) {
			System.out.println("El número debe ser positivo");
			System.out.println("Introduce un nuevo numero");
			numero = Utils.pedirEntero();
		}
		if(numero>=0) {
			int cifras = contarCifras(numero);
			System.out.println("El número " + numero + " tiene " + cifras + " cifras. ");
		}
		
	}
	
	public int contarCifras(int num) {
		String convertido = String.valueOf(num);
		return convertido.length();
	}
}
